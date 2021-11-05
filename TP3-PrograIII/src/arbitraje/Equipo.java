package arbitraje;

import java.util.HashMap;

public class Equipo {
	private String _nombre;
	private HashMap <Integer, Integer> _arbitros;
	
	public Equipo (String nombre) {
		_nombre = nombre;
		_arbitros = new HashMap <>();
	}
	
	public void agregarArbitro (int arbitro) {
		_arbitros.put(arbitro, _arbitros.get(arbitro) + 1);
	}
	
	public HashMap<Integer, Integer> getArbitros () {
		return _arbitros;
	}

	public String get_nombre() {
		return _nombre;
	}
	@Override
	public String toString() {
		return _nombre;
	}
}
