package teste.br.com.java.polimorfismo;

public class ContaCorrenteEspecial extends ContaCorrente implements Transferivel {
	
	protected double limite;
	
	@Override
	public void sacar (double valor) throws SaldoInsuficienteException{
		
		if (valor >saldo + limite) {
			throw new SaldoInsuficienteException();
			
		}
		saldo = saldo - valor;
	}
	
	public double verificarSaldo() {
		return 0;
	}

	@Override
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return true;
	}

}
