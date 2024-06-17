package exerciciosjavadois;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        int somaPares = 0;
		        int contador = 1;

		        System.out.println("Números pares entre 1 e " + numero + ":");

		        while (contador <= numero) {
		            if (contador % 2 == 0) {
		                System.out.println(contador);
		                somaPares += contador;
		            }
		            contador++;
		        }

		        System.out.println("A soma dos números pares é: " + somaPares);
	}

}
