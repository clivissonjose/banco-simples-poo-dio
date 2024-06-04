package banco;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente clivisson = new Cliente();
		Cliente rafaela = new Cliente();
		rafaela.setNome("rafaela");
		clivisson.setNome("Clívisson");
		
		Conta clivissonCC = new ContaCorrente(clivisson);
		Conta rafaCP = new ContaPoupanca(rafaela);
		
		clivissonCC.depositar(1000);
		rafaCP.depositar(200);
		rafaCP.transferir(200, clivissonCC);
		
		clivissonCC.imprimirExtrato();
		rafaCP.imprimirExtrato();
	}
}
