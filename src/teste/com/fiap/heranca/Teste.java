package teste.com.fiap.heranca;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal ();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove.");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Come ração");
		cachorro.setLatido("Au Au");
		cachorro.setLocomove("anda com 4 patas");
		
		Animal bullTerrier = new Cachorro();
		bullTerrier.setAlimenta("Come Carne Crua");
		bullTerrier.setLocomove("4 patas pequenas");
		
	}

}
