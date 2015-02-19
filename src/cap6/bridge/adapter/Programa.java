package cap6.bridge.adapter;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) throws Exception {

		/*
		 * Padrão bridge
		 * 
		 * Repare que essa interface é uma "ponte" para a implementação
		 * concreta. O nome desse padrão de projeto é justamente esse: bridge.
		 */

		Mapa mapa = new GoogleMaps();
		String devolveMapa = mapa.devolveMapa("Rua Mané Vicente");

		/*
		 * Padão Adapter
		 * 
		 * Quando temos um conjunto de classes legadas, que achamos que seu uso
		 * vai sujar o novo sistema, criamos um "adaptador" que facilita sua
		 * utilização. O nome desse padrão de projetos é Adapter.
		 */

		Relogio relogio = new RelogioSistema();
		Calendar dataAtual = relogio.hoje();

	}

}
