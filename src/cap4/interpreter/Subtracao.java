package cap4.interpreter;

import cap5.visitor.Visitor;

public class Subtracao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direita = direta;
	}
	
	@Override
	public int avalia() {
		int resultadoEsquerda = esquerda.avalia();
		int resultadoDireita = direita.avalia();
		
		return resultadoEsquerda - resultadoDireita;
	}
	
	/**
	 * VISITOR
	 */

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSubtracao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}
	
	

}
