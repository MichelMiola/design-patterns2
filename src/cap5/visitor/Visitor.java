package cap5.visitor;

import cap4.interpreter.Divisao;
import cap4.interpreter.Multiplicacao;
import cap4.interpreter.Numero;
import cap4.interpreter.RaizQuadrada;
import cap4.interpreter.Soma;
import cap4.interpreter.Subtracao;

public interface Visitor {

	public abstract void visitaSoma(Soma soma);

	public abstract void visitaSubtracao(Subtracao subtracao);

	public abstract void visitaMultiplicaco(Multiplicacao multiplicacao);

	public abstract void visitaDivisao(Divisao divisao);

	public abstract void visitaRaizQuadrada(RaizQuadrada raizQuadrada);

	public abstract void visitaNumero(Numero num);

}