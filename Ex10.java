package exerciciosjavadois;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int primeiro = 0;
		        int segundo = 1;
		        int contador = 0;

		        System.out.println("Os primeiros 20 n�meros da sequ�ncia de Fibonacci s�o:");

		        while (contador < 20) {
		            System.out.println(primeiro);
		            int proximo = primeiro + segundo;
		            primeiro = segundo;
		            segundo = proximo;
		            contador++;
		}

	}

}
