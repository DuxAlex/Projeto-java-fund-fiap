package teste.br.com.java.polimorfismo;

public class ContaCorrente {
	
	protected double saldo;
	//FINAL NAO PODE SER ALTERADA E STATIC PODE SER COMPARTILHADA EM TODAS AS INTANCIAS
	// É UMA CONSTANTE É PUBLICA
	// TODA CONSTANTE É JAVA DEVE SER PUBLICA
	public static final int BANCO = 33;
	
	public void sacar (double valor) throws SaldoInsuficienteException{
		
		if (valor >saldo) {
			throw new SaldoInsuficienteException();
			
		}
		saldo = saldo - valor;
	}

}
