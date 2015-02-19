package cap4.interpreter;

import cap5.visitor.Visitor;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}
	
	@Override
	public int avalia() {
		
		int expressao = this.expressao.avalia();		
		 return (int) Math.sqrt(expressao);
	}
	
	/**
	 * VISITOR
	 */

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}

	public Expressao getExpressao() {
		return expressao;
	}
	
	

}
