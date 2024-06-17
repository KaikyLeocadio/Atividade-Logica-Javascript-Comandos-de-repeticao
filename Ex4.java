package exerciciosjavadois;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        int soma = 0; 
		        int contador = 0; 

		        while (contador < 5) {
		            System.out.print("Digite um número inteiro: ");
		            int numero = scanner.nextInt();
		            soma += numero;
		            contador++; 
		        }

		        double media = (double) soma / 5;

		        System.out.println("A média aritmética dos números é: " + media);
	}
}