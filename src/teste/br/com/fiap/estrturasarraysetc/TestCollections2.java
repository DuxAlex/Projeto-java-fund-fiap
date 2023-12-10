package teste.br.com.fiap.estrturasarraysetc;

import java.util.*;

public class TestCollections2 {
	public static void main(String[] args) {
		
		//INTERFACE SET
		Set<String> cesta = new HashSet<String>();
		
		System.out.println("A Array cesta esta vazia? " + cesta.isEmpty());
		
		cesta.add("Maçã");
		cesta.add("Maçã");
		cesta.add("maçã");
		System.out.println("A Array cesta esta vazia? " + cesta.isEmpty());
		
		
		System.out.println("o tamanho da array cesta é " + cesta.size());
		// a classe HashSet não pertime items duplicados
		System.out.println(cesta);
		
		System.out.println("--------------------------------------");
		
		//INTERFACE MAP
		
		Map<String, String> caixa = new HashMap<String, String>();
		
		System.out.println("A interface map cesta esta vazia? " + caixa.isEmpty());
		
		caixa.put("M2225", "Alex");
		caixa.put("M2226", "Ruth");
		caixa.put("M2227", "Augusto");
		
		
		System.out.println("o tamanho da interface map caixa é " + caixa.size());
		//retorna se contem essa chave
		System.out.println(caixa.containsKey("M2225"));
		//retorna se contem esse valor
		System.out.println(caixa.containsValue("Alex"));
		//IMPRIME TODO O HASHMAP
		System.out.println(caixa);
		
		
		System.out.println("A interface map esta vazia? " + caixa.isEmpty());
		
	}
	

}
