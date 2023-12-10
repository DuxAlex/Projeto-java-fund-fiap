package teste.br.com.fiap.estrturasarraysetc;

public class LenthStartEnds {
	
	public static void main(String[] args) {
	
		String descricao = new String ("maçã, gostosa!");
		
		//Retorna o tamanho da string
		System.out.println(descricao.length());
		
		
		//Retorna o que inicia a String
		System.out.println(descricao.startsWith("maçã"));
		
		
		//Retorna o que fianliza a String
		System.out.println(descricao.endsWith("!"));
		
		//retorna o caractere naquela posição
		System.out.println(descricao.charAt(1));
		
		//retorna a posição do caractere em específico
		System.out.println(descricao.indexOf("g"));
		System.out.println(descricao.indexOf("gostosa"));
		
		//retorna a posição da ultima ocorrencia do caractere em específico 
		System.out.println(descricao.indexOf("a"));
		System.out.println(descricao.lastIndexOf("a"));
		
		
	}
}
