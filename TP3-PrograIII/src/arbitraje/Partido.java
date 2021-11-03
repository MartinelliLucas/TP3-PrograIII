package arbitraje;

public class Partido {
	
	private String _equipo1;
	private String _equipo2;
	int _arbitro;
	
	public Partido (String equipo1 , String equipo2) {
		_equipo1 = equipo1;
		_equipo2 = equipo2;
	}
	
	public String getEquipo1 () {
		return _equipo1;
	}
	public String getEquipo2 () {
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
		sb.append(_equipo1).append(" - ").append(_equipo2).append(System.lineSeparator());
		return sb.toString();
	}
}
