package teste.com.java;

public class TesteConta {
	public static void main(String[] args) {
		
		/*Conta contaCorrente = new Conta ();
		Conta contaPoupanca = new Conta ();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "leandro";
		contaCorrente.cliente.idade = 36;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 105.5;
		contaPoupanca.cliente.nome = "alex";
		contaPoupanca.cliente.idade = 22;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "plinio";
		contaInvestimento.cliente.idade = 66;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		*/
		
		
		//com o construtor vc ja passa os parametros na criaçãoda classe
		Conta cc = new Conta(100, 50);
		System.out.println(cc.recuperarSaldo());
		
		
		
		
	}
}
