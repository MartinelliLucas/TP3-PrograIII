package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import arbitraje.*;
import data.Lectura;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainForm {

	private JFrame frame;
	private static ArrayList <Fecha> torneo;
	private static TreeSet<String> equipos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();

		agregarEquipos();
		crearTorneo();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 8));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane calendarioOriginal = new JTextPane();
		calendarioOriginal.setBounds(104, 39, 226, 420);
		frame.getContentPane().add(calendarioOriginal);
		
		JTextPane calendarioResultado = new JTextPane();
		calendarioResultado.setBounds(458, 39, 226, 420);
		frame.getContentPane().add(calendarioResultado);
		
		JButton leerCalendario = new JButton("Leer Calendario");
		leerCalendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					escribirCalendario();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Lectura leerarchivo = new Lectura();
				calendarioOriginal.setText(leerarchivo.getCalendario());
			}
		});
		leerCalendario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		leerCalendario.setBounds(166, 470, 116, 40);
		frame.getContentPane().add(leerCalendario);
		
		JButton aplicarHeuristica = new JButton("Aplicar Heur\u00EDstica");
		aplicarHeuristica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Instancia arbitraje = new Instancia (torneo , equipos);
					Solver solver = new Solver (arbitraje);
			}


		});
		aplicarHeuristica.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aplicarHeuristica.setBounds(522, 470, 116, 40);
		frame.getContentPane().add(aplicarHeuristica);
		
		JLabel lblNewLabel = new JLabel("Calendario Original");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(142, 13, 142, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Asignaci\u00F3n de \u00C1rbitros");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(489, 14, 163, 20);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
	private static void crearTorneo() {
		torneo = new ArrayList <Fecha>();
		Fecha fecha1 =new Fecha();
		fecha1.agregarPartido(new Partido ("RIVER", "BOCA"));
		fecha1.agregarPartido(new Partido ("INDEPENDIENTE", "RACING"));
		fecha1.agregarPartido(new Partido ("SAN LORENZO", "HURACAN"));
		
		Fecha fecha2 = new Fecha();
		fecha2.agregarPartido( new Partido ("RIVER", "INDEPENDIENTE"));
		fecha2.agregarPartido( new Partido ("SAN LORENZO", "BOCA"));
		fecha2.agregarPartido( new Partido ("HURACAN", "RACING"));
		
		Fecha fecha3 = new Fecha();
		fecha3.agregarPartido( new Partido ("RIVER", "SAN LORENZO"));
		fecha3.agregarPartido( new Partido ("HURACAN", "INDEPENDIENTE"));
		fecha3.agregarPartido( new Partido ("RACING", "BOCA"));
		
		Fecha fecha4 = new Fecha();
		fecha4.agregarPartido( new Partido ("RIVER", "HURACAN"));
		fecha4.agregarPartido( new Partido ("RACING", "SAN LORENZO"));
		fecha4.agregarPartido( new Partido ("BOCA", "INDEPENDIENTE"));
		
		Fecha fecha5 = new Fecha();
		fecha5.agregarPartido( new Partido ("RIVER", "RACING"));
		fecha5.agregarPartido( new Partido ("BOCA", "HURACAN"));
		fecha5.agregarPartido( new Partido ("INDEPENDIENTE", "SAN LORENZO"));
		
		torneo.add(fecha1);
		torneo.add(fecha2);
		torneo.add(fecha3);
		torneo.add(fecha4);
		torneo.add(fecha5);
	}

	private static void agregarEquipos() {
		equipos = new TreeSet <String>();
		equipos.add("BOCA");
		equipos.add("RIVER");
		equipos.add("RACING");
		equipos.add("INDEPENDIENTE");
		equipos.add("SAN LORENZO");
		equipos.add("HURACAN");
	}
	
	private void escribirCalendario () throws IOException{
		try {
			FileOutputStream fos = new FileOutputStream("Calendario.txt");
			OutputStreamWriter out = new OutputStreamWriter(fos);
			for (Fecha fecha : torneo) {
				out.write("Fecha " + (torneo.indexOf(fecha)+1)  + "\n");
				for (int i = 0; i < fecha.getPartidos().size(); i++) {
					out.write(fecha.getPartidos().get(i).toString());
				}
				
			}
			
			out.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
