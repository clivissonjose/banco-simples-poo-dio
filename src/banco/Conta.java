package banco;

public abstract class Conta implements InterfaceConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
    public void sacar(double valor) {
    	if(valor <= saldo)
		   this.saldo-= valor;
    	else
    		System.out.println("Saldo insuficiente!");
	}
	
	public void depositar(double valor) {
			this.saldo+= valor;
	}
	
	public void transferir(double valor, Conta contaDeposito) {
		if(valor <= saldo) {
			this.sacar(valor);
			contaDeposito.depositar(valor);
		}else
			System.out.println("Saldo insuficiente!" + this.cliente.getNome());	
	}
	
	protected void info() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		
	}
	// Getters ( Usando apenas os getters)
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
}
