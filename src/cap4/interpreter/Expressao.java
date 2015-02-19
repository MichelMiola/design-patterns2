package cap4.interpreter;

import cap5.visitor.Visitor;

public interface Expressao {
	
	int avalia();
	
	/*
	 * VISITOR
	 */
	void aceita(Visitor visitor);

}
