package exerciciosjavadois;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        int anterior = 0, atual = 1;

		        System.out.print("Sequência de Fibonacci: " + anterior);

		        while (atual <= numero) {
		            System.out.print(", " + atual);
		            int proximo = anterior + atual;
		            anterior = atual;
		            atual = proximo;
		        }
	}

}
