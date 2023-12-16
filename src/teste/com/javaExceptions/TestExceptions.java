package teste.com.javaExceptions;

public class TestExceptions { // excpetion unchecked

	public static void main(String[] args) {

		/*
		 * try { // trecho onde a exceção pode ocorrer
		 * 
		 * int val = 10 / 0; System.out.println(val);
		 * 
		 * } catch (Exception e) {// captura da exceção
		 * 
		 * // tratamento da exceção e.printStackTrace();
		 * 
		 * }
		 */
		try { // exception unchecked

			// int val = 10 / 0;

			// int[] valores = new int[3];
			// System.out.println(valores[4]);

			// String nome = null;
			// System.out.println(nome.length());

			// int numero = Integer.parseInt("zero");

		} catch (ArithmeticException e) {
			System.out.println("Não é possivel realizar uma divisão por zero!");

			// mensam com lista de erros
			System.out.println(e.getMessage());
			// imrpime a pilha de erro da exceção
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nâo é possivel acessar a posição 4 do array!");

		} catch (NullPointerException e) {
			System.out.println("Não foi possivel retornar o length, variavel não instanciad !");

		} catch (NumberFormatException e) {
			System.out.println("não foi possível realizar a conversão!");

		} catch (Exception e) {
			System.out.println("Erro na Execução do programa.");

		} finally {
			System.out.println("O finally sempre será executado, mesmo que a exceção não ocorra!");
		}

	}
}
