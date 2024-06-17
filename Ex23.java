package exerciciosjavadois;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para exibir a sequência de Fibonacci: ");
		        int limite = scanner.nextInt();

		        int numeroanterior = 0;
		        int numeroatual = 1;

		        System.out.println("Sequência de Fibonacci até " + limite + ":");

		        System.out.print(numeroanterior + " "); 
		        
		        do {
		            System.out.print(numeroatual + " ");

		            int proximonumero = numeroanterior + numeroatual;
		            numeroanterior = numeroatual;
		            numeroatual = proximonumero;
		        } while (numeroatual <= limite);
	}

}
