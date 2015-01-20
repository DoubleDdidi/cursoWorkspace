package banco;

public class Conta {
	private String titular;
	private double saldo;

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa) {

	}

	ContaCorrente contaCorrente = new ContaCorrente();

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}