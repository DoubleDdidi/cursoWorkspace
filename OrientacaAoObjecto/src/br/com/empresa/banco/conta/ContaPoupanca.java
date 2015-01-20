package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

//	public int compareTo(ContaPoupanca outra) {
//		return this.getNumero() - outra.getNumero();
//
//	}
    public int compareTo(ContaPoupanca outra) {
    	return  this.nome.compareTo(outra.nome);
        
      }

}
