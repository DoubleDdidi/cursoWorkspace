package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
    List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
    Random random = new Random();

    ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Caio");
    c1.deposita(random.nextInt(10000) + random.nextDouble());
    contas.add(c1);

    ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Adriano");
    c2.deposita(random.nextInt(10000) + random.nextDouble());
    contas.add(c2);

    ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Victor");
    c3.deposita(random.nextInt(10000) + random.nextDouble());
    contas.add(c3);

    Collections.sort(contas);

    for (ContaPoupanca conta : contas) {
        System.out.println(conta.toString());
    }
}
}
