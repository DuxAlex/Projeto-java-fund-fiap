package teste.br.com.testearquivo;

//java io é uma classe para manipulação de arquivo
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {
	public static void main(String[] args) {

		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.dir"); // Obtém o diretório de trabalho atual
		String caminho = Paths.get(diretorio, "estoque.csv").toString();

		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade");
		conteudo.add("pera; 200; pct; R$ 5,40");
		conteudo.add("Morango; 400; cx; R$ 6,50");
		conteudo.add("Abacaxi; 200; un; R$ 5,00");

		// comentar e descomentar conforme o teste executado

		// gravarEstoque(nomeDoArquivo, caminho, conteudo);

		lerEstoque(caminho);

		// INIT VERIFICAR STATUS DO ARQUIVO
		File arquivo = new File(caminho);

		if (arquivo.exists()) {
			System.out.println("O arquivo existe! " + "\nPode ser lido: " + arquivo.canRead() + "\nPode ser gravado: "
					+ arquivo.canWrite() + "\nTamanho: " + arquivo.length() + "\ncaminho " + arquivo.getPath());
		} else {
			// cria arquivo
			try {
				if (arquivo.createNewFile()) {
					System.out.println("Arquivo criado!");
				} else {
					System.out.println("Arquivo não criado!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// FIM DO VERIFICAÇÃO

		// INIT VERIFICA DIRETORIO
		File fDiretorio = new File(diretorio);

		if (fDiretorio.exists()) {
			System.out.println("Diretório Existe");
		} else {
			if (fDiretorio.mkdir()) {
				System.out.println("Diretório criado!");
			} else {
				System.out.println("Diretório não criado!");
			}
		}
		// FIM VERIFICA DIRETORIO

	}

	private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

		FileWriter stream;
		PrintWriter print;

		try {
			// stream é uma conexao de escrita para o arquivo
			stream = new FileWriter(caminho);
			// a classe PrintWriter escrevará no arquivo
			print = new PrintWriter(stream);

			for (String linha : conteudo) {
				// ometodo println escreve uma linho no arquivo
				print.println(linha);
			}
			// close fecha o arquivo
			print.close();
			stream.close();

			System.out.println("o arquivo " + nomeDoArquivo + " foi salvo em " + caminho);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void lerEstoque(String caminho) {
		try {
			// abre o arquivo
			FileReader stream = new FileReader(caminho);

			// BufferedREader possui um metodo readLine()
			// lê uma linha de arquivo e retorna uma String com o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);

			// Lê uma linha do arquivo
			String linha = reader.readLine();

			// enquanto a linha for diferente de nulo
			while (linha != null) {

				System.out.println(linha);
				// Lê a proxima linha do arquivo
				linha = reader.readLine();
			}
			reader.close();
			// fecha o arquivo
			stream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
