package cap6.bridge.adapter;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) throws Exception {

		/*
		 * Padr�o bridge
		 * 
		 * Repare que essa interface � uma "ponte" para a implementa��o
		 * concreta. O nome desse padr�o de projeto � justamente esse: bridge.
		 */

		Mapa mapa = new GoogleMaps();
		String devolveMapa = mapa.devolveMapa("Rua Man� Vicente");

		/*
		 * Pad�o Adapter
		 * 
		 * Quando temos um conjunto de classes legadas, que achamos que seu uso
		 * vai sujar o novo sistema, criamos um "adaptador" que facilita sua
		 * utiliza��o. O nome desse padr�o de projetos � Adapter.
		 */

		Relogio relogio = new RelogioSistema();
		Calendar dataAtual = relogio.hoje();

	}

}
