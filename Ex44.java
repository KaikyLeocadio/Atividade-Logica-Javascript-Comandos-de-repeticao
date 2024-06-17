package exerciciosjavadois;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para calcular o fatorial: ");
		        int numero = scanner.nextInt();

		        long fatorial = 1;

		        if (numero >= 0) {
		            for (int i = 1; i <= numero; i++) {
		                fatorial *= i;
		            }

		            System.out.println("O fatorial de " + numero + " é: " + fatorial);
		        } else {
		            System.out.println("Número inválido. O fatorial não pode ser calculado.");
		        }
	}

}
