package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import clases.Lectura;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainForm {

	private JFrame frame;

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
				Lectura leerarchivo = new Lectura();
				calendarioOriginal.setText(leerarchivo.getCalendario());
			}
		});
		leerCalendario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		leerCalendario.setBounds(166, 470, 116, 40);
		frame.getContentPane().add(leerCalendario);
		
		JButton aplicarHeuristica = new JButton("Aplicar Heur\u00EDstica");
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
}
