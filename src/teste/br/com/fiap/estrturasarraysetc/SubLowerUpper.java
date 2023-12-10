package teste.br.com.fiap.estrturasarraysetc;

public class SubLowerUpper {

	public static void main(String[] args) {

		String descricao = new String ("Maça Gala, a maça mais doce do mercado");
		
		//tudo minusculo
		System.out.println(descricao.toLowerCase());
		//tudo MAIUSCULO
		System.out.println(descricao.toUpperCase());
		
		//BUSCA E RETORNA UM TRECHO DE CARACTERES DO INDICE 0 AOU 4
		System.out.println(descricao.substring(0,4));
		
		//BUSCA E RETORNA DO INDICE 4 ATE O FINAL DA STRING
		System.out.println(descricao.substring(4));
		
		//substring vai pegar o trech e o indexOf retornará o trecho que começa
		//a string Maça e o segundo indexOf informará que deve "cortar "quando o
		// caractere espaço for encontrado.
		System.out.println(descricao.substring(
				descricao.indexOf("Maça"),
				descricao.indexOf(" ")));
		
		System.out.println(descricao);
	}

}
