
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExcecaoChecked {

	public static void main(String[] args) throws IOException {
		/*
		 * PREENCHENDO TXT COM JAVA E O A CLASSE import java.io.BufferedReader; import
		 * java.io.FileWriter; import java.io.IOException; import java.io.PrintWriter;
		 */

		FileWriter fw = new FileWriter("C:\\Users\\alexm\\eclipse-workspace\\SistemaBancario\\nota.txt");

		PrintWriter print = new PrintWriter(fw);

		print.println("Maça = R$ 4,00");
		print.println("Morango = R$ 6,50");
		print.println("Total = R$ 10,50");
		fw.close();

	}
}
