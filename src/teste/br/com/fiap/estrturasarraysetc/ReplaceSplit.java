package teste.br.com.fiap.estrturasarraysetc;

import java.util.Arrays;

public class ReplaceSplit {
	
	public static void main(String[] args) {
		
		String descricao = new String ("Maçã tipo Gala \nA maçã mais doce do mercado");

		
		//substitui um caractere po outro
		System.out.println (descricao.replace("G","g"));
		System.out.println (descricao.replace("Gala","Fuji"));
		System.out.println (descricao.replace("a","A"));
		
		
		//split quebra a string com delimitador "espaço" e conta quantas
		//strings foram quebradas a partir da quebra pelo metodo "espaço"
		System.out.println (descricao.split(" ").length);
		
		//fará a impressão do resultado da quebra pelo limitador espaço
		System.out.println (Arrays.toString(descricao.split(" ")));
		
		

	}
	

}
