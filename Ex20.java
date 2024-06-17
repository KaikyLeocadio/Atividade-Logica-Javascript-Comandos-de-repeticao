package exerciciosjavadois;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para exibir a tabuada: ");
		        int numero = scanner.nextInt();

		        int contador = 1;

		        System.out.println("Tabuada do número " + numero + ":");

		        do {
		            int resultado = numero * contador;
		            System.out.println(numero + " x " + contador + " = " + resultado);
		            contador++;
		        } while (contador <= 10);
	}

}
