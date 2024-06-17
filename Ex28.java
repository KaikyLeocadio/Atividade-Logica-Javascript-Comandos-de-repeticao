package exerciciosjavadois;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        int numeroOriginal = numero;
		        System.out.println("Dígitos separados do número " + numero + ":");

		        do {
		            int digito = numero % 10; 
		            System.out.println(digito);
		            numero /= 10; //tira o último dígito do numero
		        } while (numero != 0);
	}

}
