package arbitraje;

import java.util.ArrayList;

public class Instancia {

	private ArrayList<Fecha> _torneo;
	private ArrayList<Equipo> _equipos;
	private int[] _arbitros;

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
}
