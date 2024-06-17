package exerciciosjavadois;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para calcular o fatorial: ");
		        int numero = scanner.nextInt();

		        int fatorial = 1;
		        int contador = 1;

		        while (contador <= numero) {
		            fatorial *= contador;
		            contador++;
		        }
		        System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}

}
