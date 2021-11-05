package arbitraje;

import java.util.Collections;

public class Solver {

	private Instancia _instancia;

	public Solver(Instancia arbitraje) {
		_instancia = arbitraje;
	}

	public Instancia solucion() {

		for (Fecha fechaActual : _instancia.get_torneo()) {
			int i = 0;
			for (Partido partidoActual : fechaActual.getPartidos()) {
				while (i < _instancia.get_arbitros().length) {
					System.out.println(_instancia.get_arbitros()[i]);
					if (	partidoActual.getEquipo1().getArbitros().get(_instancia.get_arbitros()[i]) <= 
							Collections.min(partidoActual.getEquipo1().getArbitros().values())
							&& partidoActual.getEquipo2().getArbitros().get(_instancia.get_arbitros()[i]) <= 
							Collections.min(partidoActual.getEquipo2().getArbitros().values())) {
						
						partidoActual.setArbitro(_instancia.get_arbitros()[i]);
						partidoActual.getEquipo1().agregarArbitro(_instancia.get_arbitros()[i]);
						partidoActual.getEquipo2().agregarArbitro(_instancia.get_arbitros()[i]);
						i++;
						break;
					} 
					else if (i + 1 < _instancia.get_arbitros().length){
						
						partidoActual.setArbitro(_instancia.get_arbitros()[i + 1]);
						partidoActual.getEquipo1().agregarArbitro(_instancia.get_arbitros()[i + 1]);
						partidoActual.getEquipo2().agregarArbitro(_instancia.get_arbitros()[i + 1]);
						i++;
						break;
						
					}
					i++;
					break;
				}

			}

		}
		return _instancia;
	}

}
