package exerciciosjavadois;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para a sequência de Fibonacci: ");
		        int numero = scanner.nextInt();

		        int primeiro = 0;
		        int segundo = 1;

		        System.out.println("Sequência de Fibonacci até " + numero + ":");

		        while (primeiro <= numero) {
		            System.out.println(primeiro);
		            int proximo = primeiro + segundo;
		            primeiro = segundo;
		            segundo = proximo;
		        }
	}

}
