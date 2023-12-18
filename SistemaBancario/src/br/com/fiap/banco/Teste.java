package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {

		/*ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(100);
		*/
		
		//USANDO INSTAnCEOF PARA VERIFICAR SE A VARIAVEL É A INSTANCIA DO OBJT ESPERADO
		
		/*Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		
		ContaCorrente c1  = (ContaCorrente) cc;
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente c2 = (ContaCorrente) conta;
		}
		*/
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2  = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		ContaCorrente conta3  = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		//polimorfismo para nao precisar criar outro metodo "criarComTaxa"
		//OBS: Não existe herança de contrutores.
		//Contrutore de classe na super classe pode dar erro na subclasse;
		System.out.println("Conta1 " + conta1.getSaldo());
		System.out.println("Conta2 " + conta2.getSaldo());
		System.out.println("Conta3 " + conta3.getSaldo());
		
		
		
	}
}
