package cap8.facade.singleton;

public class Programa {

	public static void main(String[] args) {
		
		EmpresaFacade fachada = new EmpresaFacadeSingleton().getInstancia();
		
	}
}
