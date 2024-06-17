package exerciciosjavadois;

import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        System.out.println("Dígitos do número " + numero + ":");

		        //faz com que os dígitos sejam separados corretamente
		        if (numero < 0) {
		            numero *= -1;
		        }

		        while (numero > 0) {
		            int digito = numero % 10; //pega o último dígito do numero
		            System.out.println(digito);
		            numero /= 10; //reemove o último dígito do numero
		        }

	}

}
