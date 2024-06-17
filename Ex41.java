package exerciciosjavadois;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();
		        int soma = 0;

		        for (int i = 2; i <= numero; i += 2) {
		            soma += i;
		        }

		        System.out.println("A soma dos números pares até " + numero + " é: " + soma);
	}

}
