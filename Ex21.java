package exerciciosjavadois;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int numero;

		        do {
		            System.out.print("Digite um número inteiro positivo: ");
		            numero = scanner.nextInt();
		        } while (numero <= 0);

		        System.out.println("Divisores de " + numero + ":");

		        int divisor = 1;

		        do {
		            if (numero % divisor == 0) {
		                System.out.println(divisor);
		            }
		            divisor++;
		        } while (divisor <= numero);
	}

}
