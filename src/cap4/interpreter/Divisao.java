package cap4.interpreter;

import cap5.visitor.Visitor;

public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		int resultadoEsquerda = esquerda.avalia();
		int resultadoDireita = direita.avalia();
		
		return resultadoEsquerda / resultadoDireita;
	}
	
	/**
	 * VISITOR
	 */

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaDivisao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}
	
	
	
	

}
