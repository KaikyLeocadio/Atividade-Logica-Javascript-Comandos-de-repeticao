package exerciciosjavadois;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();

		        System.out.println("Os d�gitos do n�mero " + numero + " s�o:");

		        String numerostring = Integer.toString(numero);

		        for (int i = 0; i < numerostring.length(); i++) {
		            System.out.println(numerostring.charAt(i));
		        }
	}

}
