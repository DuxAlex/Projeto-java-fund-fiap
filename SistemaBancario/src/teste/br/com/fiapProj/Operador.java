package teste.br.com.fiapProj;

public class Operador {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z = 15;
		
		int result = x + y;
		
		System.out.println(result);
		
		
		result = x - y;
		System.out.println(result);
		
		result = x * y;
		System.out.println(result);
		
		result = x / y;
		System.out.println(result);
		
		result = x % y;
		System.out.println(result);
		
		result = z - x + y * (x / y);
		System.out.println(result);
		
		
		//atribuição
		
		int o = 10;
		o = o + 10;
		
		System.out.println(o);
		
		int oi = 5;
		oi += 10;
		System.out.println(oi);
		
		//incremento
		
		int incre = 10;
		//incre = incre + 1;
		incre++;
		
		//ou ++incre;
		
		System.out.println(incre);
		
		//decremento;
		
		int decre = 10;
		
		//decre = decre - 1;
		decre--;
		
		System.out.println(decre);
		
		//ou--decre;
		
		
		//operadores de igualdade e relacionais
		
		int idade = 10;
		boolean maioridade = idade !=18;
		
		System.out.println(maioridade);
		
		
		//OPERADORES LOGICOS
		
		int idadeVotar = 20;
		
		boolean precisaVotar = idadeVotar>= 18 && idade < 70;
		
		System.out.println(precisaVotar);
		
		if (precisaVotar = false) {
			System.out.println("idade insuficiente para votar");
			
		}else {
			System.out.println("pode votar");
			
		}
		
		int nrAmarelo = 2, nrVermelho = 1;
		boolean  suspenso = nrAmarelo == 1 || nrVermelho == 1;
		
		System.out.println(suspenso);
		
		
		//só é verdadeiro se apenas um dos for verdadeiro caso contrário é falso
		int abc = 9, xyz = 11;
		boolean teste = abc > 10 ^ xyz >10; //apenas uma das é verdadeira.
		
		System.out.println(teste);
		
		// usando negação
		
		int idadeAdulto = 20;
		boolean maiorIdade = !(idade >=18); // a exclamação inverte o resultado da operação logica
		
		System.out.println(maiorIdade);
		
	}
	

}




















