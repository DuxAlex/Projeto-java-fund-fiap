package teste.br.com.fiapProj;

//import para uso da prompt de entrada de dados Scanner
import java.util.Scanner;

public class FluxoDeControle {
	public static void main(String[] args) {
		int idade = 0;

		// prompt de entrada de dados Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("digita seu nome: ");
		String nome = sc.nextLine();
		System.out.println("digite sua idade:");
		idade = sc.nextInt();

		/*
		 * if (condição) {bloco de instrução}
		 */

		if (idade < 0)
			System.out.println("idade invalida");
		if (idade >= 10 && idade < 70) {
			System.out.println("maior de idade");
		} else if (idade >= 70 && idade < 100) {
			System.out.println("terceira idade");
			if (idade >= 100) {
				System.out.println("Centenário");
			}
		} else {
			System.out.println("menor idade");
		}
	}

}
