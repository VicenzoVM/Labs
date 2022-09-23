package banco;

public class Conta {
	private double saldo;
	private String numero;
	
	public Conta(double saldo, String numero) {
		this.saldo = saldo;
		this.numero = numero;
	}
	public void depositar(double valor) {
		saldo += valor;
		
	}
	public void sacar(double valor) {
		if(valor > saldo)
			System.out.println("operacao indisponivel: saque maior que saldo!");
		else {
			saldo -= valor;
		}
		
		
		
	}
	public void conta(String nome) {
		System.out.printf("nome da conta e %s", nome);
		
	}
	
	@Override
	public String toString() {
		return saldo+ "";
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
