package exerciciosjavadois;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        System.out.println("Os dígitos do número " + numero + " são:");

		        String numerostring = Integer.toString(numero);

		        for (int i = 0; i < numerostring.length(); i++) {
		            System.out.println(numerostring.charAt(i));
		        }
	}

}
