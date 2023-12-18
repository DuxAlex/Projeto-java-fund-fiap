package teste.br.com.fiap.estrturasarraysetc;

import java.util.*;

public class TestCollections {

	public static void main(String[] args) {
		//INTERFACE LIST
		ArrayList carrinho = new ArrayList();
		double valor = 100.55;
		int valor2 = 1;
		int valor3;

		// adiciona valor ao arrayslist
		carrinho.add(valor); // adicionar valor a arraylistcarinho na primeira posição
		carrinho.add("uva");// na segunda possição string uva
		carrinho.add(valor2);// na terceira posição valor2

		// recuperar valor no indice 1
		System.out.println(carrinho.get(1));

		valor3 = (int) carrinho.get(2);
		System.out.println(valor3);

		System.out.println("-----------------------------------");

		// interface List e uso de generics
		// Generics não permite tipos primitivos

		// só pode ter elementos tipos strings usando o generics <>
		List<String> carrinho1 = new ArrayList<String>();

		// retorna se está vazio
		System.out.println(carrinho1.isEmpty());

		carrinho1.add("Maça");
		carrinho1.add("morango");
		carrinho1.add("Maça");
		carrinho1.set(1, "pera");

		// retorna se no array contem Maça carrinho
		System.out.println(carrinho1.contains("Maça"));
		// retorna qual a posição que Maça esta no arraylist carrinho
		System.out.println(carrinho1.indexOf("Maça"));
		// busca a palavra Maça apartir da posição setada pelo indexof
		System.out.println(carrinho1.get(carrinho1.indexOf("Maça")));
		// retorna qual a ultima ocorrencia da palavra Maça dentro do arraylist
		System.out.println(carrinho1.lastIndexOf("Maça"));

		// não está mais vazio
		System.out.println("a Array esta vazia? " + carrinho1.isEmpty());
		// tamanho do arraylist
		System.out.println("o tamanho do arary é " + carrinho1.size());

	}

}
