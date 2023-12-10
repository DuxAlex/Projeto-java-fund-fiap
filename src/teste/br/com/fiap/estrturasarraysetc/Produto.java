package teste.br.com.fiap.estrturasarraysetc;

public class Produto {

	String nome;
	String descricao;
	Float valor;
	
	//INICIO DOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	//FIM DOS GETTERS E SETTERS
	
	//INICIO DOS METODOS
	
	@Override
	public String toString () {
		return "Produto [nome= " + nome +", descrição= " + descricao + ", valor= " + valor + "]"; 
	}
	
}
