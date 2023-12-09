package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	/**
	 * implementar interface seriazlizable para transformar
	 * em pacotes de bits e trafegar na rede
	 * */
	
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	
	

}
