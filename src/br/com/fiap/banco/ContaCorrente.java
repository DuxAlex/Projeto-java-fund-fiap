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
	
	public double getSaldoDisp() {
		return super.getSaldo() + chequeEspecial;
	}
	
	//*** FIM DOS GETTERS E SETTERS ***
	
	//INICIO METODOS
	
	
	//Sobrescrita para induzir o polimorfismo
	//ou seja dois metodos com mesmo nome e parametro
	//porém de formas diferentes
	//OBS: Precisa marcar o metodo como OVERRIDE
	
	@Override
	public void retirar (double valor) {
		valor += 10;
		super.retirar(valor);
	}
	
	
	//** FIM METODOS ***
}
