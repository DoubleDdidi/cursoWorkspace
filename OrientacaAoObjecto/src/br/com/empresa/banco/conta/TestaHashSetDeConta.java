package br.com.empresa.banco.conta;

import java.util.HashSet;

public class TestaHashSetDeConta {
    public static void main(String[] args) {
        HashSet<Conta> contas = new HashSet<Conta>();

        ContaPoupanca c1 = new ContaPoupanca(123, "Mauricio");
        ContaPoupanca c2 = new ContaPoupanca(123, "Adriano");
        ContaPoupanca c3 = new ContaPoupanca(444, "Luiz");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        System.out.println("Total de contas no HashSet: " + contas.size());
    }
}
