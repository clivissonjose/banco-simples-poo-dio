package banco;

public class ContaCorrente extends Conta{


	public ContaCorrente(Cliente cliente) {
		// TODO Auto-generated constructor stub
		super(cliente);
	}

	public void imprimirExtrato() {
		   System.out.println("=== Conta corrente === ");
		   super.info();
	}

}
