package cap4.interpreter;

import cap5.visitor.Visitor;

public class Numero implements Expressao {
	
	private int num;

	public Numero(int num) {
		this.num = num;
	}

	@Override
	public int avalia() {
		return num;
	}

	/**
	 * VISITOR 
	 */
	
	public int getNumero() {
		return num;
	}
	
	/**
	 * VISITOR 
	 */

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}

}
