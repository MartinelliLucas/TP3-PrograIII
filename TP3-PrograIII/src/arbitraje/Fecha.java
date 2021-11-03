package arbitraje;

import java.util.ArrayList;

public class Fecha {
	
	private ArrayList <Partido> _partidos ;
	
	public Fecha () {
		_partidos = new ArrayList <Partido>();
	}
	
	public ArrayList<Partido> getPartidos(){
		return _partidos;
	}
	
	public void agregarPartido (Partido partido) {
		_partidos.add(partido);
	}
}
