package exerciciosjavadois;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro positivo: ");
		        int numero = scanner.nextInt();

		        if (numero > 0) {
		            System.out.println("Divisores de " + numero + ":");

		            for (int i = 1; i <= numero; i++) {
		                if (numero % i == 0) {
		                    System.out.println(i);
		                }
		            }
		        } else {
		            System.out.println("O número deve ser positivo.");
		        }
	}

}
