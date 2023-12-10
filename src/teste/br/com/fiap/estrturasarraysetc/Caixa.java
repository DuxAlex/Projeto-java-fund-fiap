package teste.br.com.fiap.estrturasarraysetc;

import java.util.Iterator;

public class Caixa {

	public static void main(String[] args) {

		int qtdProdutos = 5;
		int registro = 0;

		// Examina as condições antes de executar e só executa a instrução e se não
		// satisfeita

		/*
		 * while (registro < qtdProdutos) { registro++;
		 * System.out.println("o produto numero " + registro + " foi registrado."); }
		 */
		// executa as intruções e depois examina as condições.

		/*
		 * do { registro++; System.out.println("o produto numero " + registro +
		 * " foi registrado."); } while (registro < qtdProdutos);
		 */

		// for possui variavel interna de contagem> a condição > incremento.
		// o for começa do 0 então o contador deve ser declarado em 1.

		/*
		 * for (int i = 1; i < qtdProdutos; i++) {
		 * System.out.println("o produto numero " + registro + " foi registrado."); }
		 */

		Produto[] produtos = new Produto[2];

		Produto prod1 = new Produto();
		prod1.setNome("limão");
		prod1.setDescricao("galego");
		prod1.setValor((float) 5);

		Produto prod2 = new Produto();
		prod2.setNome("Maça");
		prod2.setDescricao("Gala");
		prod2.setValor((float) 6);

		produtos[0] = prod1;
		produtos[1] = prod2;

		/*
		 * for (int i=0; i < produtos.length; i++) {
		 * System.out.println(produtos[i].toString()); }
		 */

		for (Produto prod : produtos) {
			System.out.println(prod.toString());
		}

		// array multidimensional
		Produto[][] localizacaoProduto = new Produto[10][3];

		// limao fica no indice 0 posicao 1
		// maçã fica no indice 1 posicao 1
		localizacaoProduto[0][1] = prod1;
		localizacaoProduto[1][1] = prod2;

		System.out.println(localizacaoProduto[0][1].getNome());

		// Trabalhando com Strings

		String nome;
		nome = new String();
		nome = "maça";

		System.out.println(nome);

		String nome2 = new String("Maçã");
		System.out.println(nome2);

		String nome3 = "maçã";
		System.out.println(nome3);

	
		//utilizando escapes
		
		
		//pular linha e posiciona o cursor no inicio da segudna linha
		String descricao = "tipo gala \nA maçã mais doce do mercado";
		System.out.println(descricao);
		
		
		//dar um espaço maior
		descricao = "tipo gala \tA mação masi doce do mercado";
		System.out.println(descricao);
		
		
		//utilizar aspas como caractere
		descricao = "tipo gala: \"A maçã mais doce do mercado\"";
		System.out.println(descricao);
	
		
		//concatenar
		
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
