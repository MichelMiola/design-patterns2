package cap4.interpreter;

import cap5.visitor.ImpressoraVisitor;
import cap5.visitor.Visitor;

public class Programa {
	
	public static void main(String[] args) {
		
		
		Expressao esquerda = new Divisao(new Numero(4), new Numero(2));
		Expressao direita = new Multiplicacao(new Numero(2), new Numero(2));

		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
		Visitor visitor = new ImpressoraVisitor();
		
		soma.aceita(visitor);
	}

}
