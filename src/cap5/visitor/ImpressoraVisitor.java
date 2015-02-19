package cap5.visitor;

import cap4.interpreter.Divisao;
import cap4.interpreter.Multiplicacao;
import cap4.interpreter.Numero;
import cap4.interpreter.RaizQuadrada;
import cap4.interpreter.Soma;
import cap4.interpreter.Subtracao;

public class ImpressoraVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {

		System.out.print("(");

		soma.getEsquerda().aceita(this);

		System.out.print(" + ");

		soma.getDireita().aceita(this);

		System.out.print(")");

	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {

		System.out.print("(");

		subtracao.getEsquerda().aceita(this);

		System.out.print(" - ");

		subtracao.getDireita().aceita(this);

		System.out.print(")");

	}

	@Override
	public void visitaMultiplicaco(Multiplicacao multiplicacao) {

		System.out.print("(");

		multiplicacao.getEsquerda().aceita(this);

		System.out.print(" * ");

		multiplicacao.getDireita().aceita(this);

		System.out.print(")");

	}
	
	@Override
	public void visitaDivisao(Divisao divisao) {
		
		System.out.print("(");
		
		divisao.getEsquerda().aceita(this);
		
		System.out.print(" / ");
		
		divisao.getDireita().aceita(this);
		
		System.out.print(")");
		
	}
	
	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
		
		System.out.print("(");
		
		System.out.print(" √ ");
		
		raizQuadrada.getExpressao().aceita(this);
		
		System.out.print(")");
		
	}

	@Override
	public void visitaNumero(Numero num) {
		System.out.print(num.getNumero());

	}

}
