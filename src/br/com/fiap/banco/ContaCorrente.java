package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	
	private String tipo;
	private double chequeEspecial;
	
	
	//INICIO DOS GETTERS E SETTERS
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	//FIM DOS GETTERS E SETTERS
	
	public double getSaldoDisp() {
		return super.getSaldo() + chequeEspecial;
	}
	
}
