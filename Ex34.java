package exerciciosjavadois;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        int soma = 0;

		        System.out.println("Digite 5 números inteiros:");

		        for (int i = 0; i < 5; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            int numero = scanner.nextInt();
		            soma += numero;
		        }

		        double media = (double) soma / 5;

		        System.out.println("A média aritmética dos números lidos é: " + media);		
	}

}
