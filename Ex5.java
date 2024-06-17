package exerciciosjavadois;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para a tabuada: ");
		        int numero = scanner.nextInt();

		        int contador = 1;

		        while (contador <= 10) {
		            int resultado = numero * contador;
		            System.out.println(numero + " x " + contador + " = " + resultado);
		            contador++;
		        }
	}

}
