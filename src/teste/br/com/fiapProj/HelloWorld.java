package teste.br.com.fiapProj;

public class HelloWorld {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int preco;
		preco = 10;
		double valor = 10.5;
		char sexo = 'm';
		boolean temFilhos = true;
		
		
		
		System.out.println("Hello java");

		System.out.println(preco);
		System.out.println(valor);
		System.out.println(sexo);
		System.out.println(temFilhos);
		
		
		int x = 10;
		double d = x;
		long l = x;
		float f = x;
		short a = 20;
		x = 5;
		
		//conversão automatica c/ possibilidade de perder informação 
		//byte> short> int> long> default or goto or assert
		//switch> long
		//default> assert
		
		double vDouble = 9.99;
		int vInt = (int) vDouble;
		
		//cast para admitir a perda de dados
		System.out.println(vDouble);
		System.out.println(vInt);
		
		
				
		
		
	}

}
