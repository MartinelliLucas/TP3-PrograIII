package arbitraje;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Instancia {

	private ArrayList<Fecha> _torneo;
	private Set<String> _equipos;
	private int[] _arbitros;

	public Instancia(ArrayList<Fecha> torneo, TreeSet<String> equipos) {
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

}
