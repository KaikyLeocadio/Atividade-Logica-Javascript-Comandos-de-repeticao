package exerciciosjavadois;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();

		        int somaPares = 0;
		        int contador = 1;

		        System.out.println("N�meros pares entre 1 e " + numero + ":");

		        while (contador <= numero) {
		            if (contador % 2 == 0) {
		                System.out.println(contador);
		                somaPares += contador;
		            }
		            contador++;
		        }

		        System.out.println("A soma dos n�meros pares �: " + somaPares);
	}

}
