package exerciciosjavadois;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro positivo: ");
		        int numero = scanner.nextInt();

		        int divisor = 1;

		        System.out.println("Divisores inteiros de " + numero + ":");

		        while (divisor <= numero) {
		            if (numero % divisor == 0) {
		                System.out.println(divisor);
		            }divisor++;
		            
		        }
	}

}
