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
		
		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		
		ContaCorrente c1  = (ContaCorrente) cc;
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente c2 = (ContaCorrente) conta;
		}
			
		
		
		
	}
}
