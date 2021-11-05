package arbitraje;

import java.util.ArrayList;

public class Instancia {

	private ArrayList <Fecha> _torneo;
	private ArrayList <Equipo> _equipos;
	private int [] _arbitros;

	public Instancia(ArrayList<Fecha> torneo, ArrayList<Equipo> equipos) {
		_torneo = torneo;
		_equipos = equipos;
		_arbitros = new int[_torneo.get(0).getPartidos().size()];
		generarArbitros();

	}

	private int[] generarArbitros() {
		int[] ret = new int[_torneo.get(0).getPartidos().size()];
		for (int i = 0; i < _arbitros.length; i++) {
			_arbitros[i] = i + 1;
			for (Equipo equipo : _equipos) {
				equipo.getArbitros().put(_arbitros[i], 0);
			}
		}
		
		return ret;
	}
	
	public ArrayList<Fecha> get_torneo() {
		return _torneo;
	}

	public ArrayList<Equipo> get_equipos() {
		return _equipos;
	}

	public int[] get_arbitros() {
		return _arbitros;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Fecha fecha : get_torneo()) {
			sb.append("Fecha " + (get_torneo().indexOf(fecha)+1)  + "\n");
			for (Partido partido : fecha.getPartidos()) {
				sb.append(partido.toString()).append(" // Árbitro: ").append(partido.getArbitro()).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
}
