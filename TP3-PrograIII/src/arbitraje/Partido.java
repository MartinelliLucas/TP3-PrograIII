package arbitraje;

public class Partido {
	
	private Equipo _equipo1;
	private Equipo _equipo2;
	int _arbitro;
	
	public Partido (Equipo equipo1 , Equipo equipo2) {
		_equipo1 = equipo1;
		_equipo2 = equipo2;
		_arbitro = 0;
	}
	
	public Equipo getEquipo1 () {
		return _equipo1;
	}
	public Equipo getEquipo2 () {
		return _equipo2;
	}
	public void setArbitro (int arbitro) {
		_arbitro = arbitro;
		
	}
	public int getArbitro () {
		return _arbitro;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(_equipo1.toString()).append(" - ").append(_equipo2.toString());
		return sb.toString();
	}
}
