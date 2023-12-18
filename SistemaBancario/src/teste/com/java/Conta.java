package teste.com.java;

public class Conta {

	int agencia;
	int numero;
	double saldo;
	
	//construto padrao
	public Conta (){}
	
	//construtor alternativo para receber apenas 1 informação o nuemro da conta
	
	public Conta (int numero) {
		this.numero= numero;
		this.saldo = 0;
	}
	
	//ou apenas receber saldo;
	
	public Conta (double nunero) {
		this.saldo=saldo;
	}// nesse caso tem q passar numero de ponto flutuante

	//construtor de classe
	public Conta (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	// sintaxe de declaração de objeto <modificador><tipo de retorno>
	// <nome do metodo em lowerCamelCase>(<lista de argumentos>){<>instruções}

	// exemplo de lsita de argumentos metodo depositar:
	// void depositar (int agencia, string numeroConta, double valor){}
	// tem 3 parametros. primeiro declara o tipo o parametro e separa com virgula
	//

	// METODO

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double recuperarSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}

	public void setNumero(int numero) {
		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}


}
