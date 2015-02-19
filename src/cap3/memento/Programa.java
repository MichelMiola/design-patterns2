package cap3.memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		
		Historico historico = new Historico();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        contrato.restaura(historico.pega(0));
        System.out.println(contrato);

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
		
		
	}
	
}
