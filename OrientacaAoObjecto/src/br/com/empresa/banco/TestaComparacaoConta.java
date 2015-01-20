package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static String equivalentes ="Equivalentes";

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(1000);
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(1000);
		
		if (c1==c2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");

		}
		
		if (c1.equals(c2)) {
			System.out.println(equivalentes);
		} else {
			System.out.println("Não Equivalentes");

		}
		
		imprimeCaracter("anotaram a data da maratona");
		converteString();

	}
	
	public static void imprimeCaracter(String caracter){
		   String[] palavras = caracter.split(" ");
           for (int i = palavras.length - 1; i >= 0; i--) {
               System.out.print(palavras[i] + " ");
           }
           System.out.println("");
	}
	
	public static void converteString(){
		String caracter = "762";
		int i = Integer.valueOf(caracter);
       
        System.out.println(i);
	}
}
