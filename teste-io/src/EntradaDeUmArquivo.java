import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in); //new Scanner(new FileInputStream("arquivo.txt"));
		PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
	    while (entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();
    }
}
