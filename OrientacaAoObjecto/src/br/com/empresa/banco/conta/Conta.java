package br.com.empresa.banco.conta;

public abstract class Conta {
	protected String nome;
	protected double saldo;
	protected int numero;

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.10;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;

	}

	public abstract void atualiza(double taxa);// {
	// this.saldo += this.saldo * taxa;
	// }
}
