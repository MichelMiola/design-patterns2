package cap7.command;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("Michel", 120.0);
		Pedido pedido2 = new Pedido("Caludio", 250.0);
		
		FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();
		filaDeTrabalho.adiciona(new PagaPedido(pedido1));
		filaDeTrabalho.adiciona(new PagaPedido(pedido2));
		filaDeTrabalho.adiciona(new ConcluiPedido(pedido1));
		
		filaDeTrabalho.processa();
		
		
	}
	
}
