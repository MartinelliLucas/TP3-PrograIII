package arbitraje;

public class Solver {
	
	private Instancia _instancia;
	
	public Solver (Instancia arbitraje) {
		_instancia = arbitraje;
	}
	
	public Instancia solucion () {
		
		for (Fecha fechaActual : _instancia.get_torneo()) {
			int i = 0;
			for (Partido partidoActual : fechaActual.getPartidos()) {
				while ( i < _instancia.get_arbitros().length) {
					if (i+1 < _instancia.get_arbitros().length &&
							partidoActual.getEquipo1().getArbitros().get(i) <= partidoActual.getEquipo1().getArbitros().get(i+1) &&
							partidoActual.getEquipo2().getArbitros().get(i) <= partidoActual.getEquipo2().getArbitros().get(i+1)) {
						partidoActual.getEquipo1().agregarArbitro(i);
						partidoActual.getEquipo2().agregarArbitro(i);
						partidoActual.setArbitro(i);
					
					}
					else if (i+1 < _instancia.get_arbitros().length) {
							partidoActual.getEquipo1().agregarArbitro(i+1);
							partidoActual.getEquipo2().agregarArbitro(i+1);
							partidoActual.setArbitro(i+1);
						
					}
					i++;
					continue;
				}	
				
			}
		}
		return _instancia;
	}
	
}
