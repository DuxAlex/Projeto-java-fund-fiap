package br.com.fiap.banco;

import java.io.Serializable;

public class Conta implements Serializable {
	/**
	 * Classe que abstrai uma Conta Bancária
	 * @author GitHub DuxAlex
	 * @version 1.0
	 */
	
	/**
	 * implementar interface seriazlizable para transformar
	 * em pacotes de bits e trafegar na rede
	 * */

	private static final long serialVersionUID = 1L;

	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta () {
	}
	
	
	
	//GETTERS E SETTERS
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * verifica o saldo da Conta
	 * @return valor do saldo da Conta
	 * */
	
	
	public double getSaldo () {
		return this.saldo;
	}
	
	//FIM DOS GETTERS E SETTERS

	public Conta (int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * retira um valor do saldo da Conta
	 *@param valor que será retirado
	 *@see depositar
	 */
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	

	
	
	
	
}
