package exerciciosjavadois;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para ver a tabuada: ");
		        int numero = scanner.nextInt();

		        System.out.println("Tabuada do " + numero + ":");

		        for (int i = 1; i <= 10; i++) {
		            System.out.println(numero + " x " + i + " = " + (numero * i));
		        }
	}

}
