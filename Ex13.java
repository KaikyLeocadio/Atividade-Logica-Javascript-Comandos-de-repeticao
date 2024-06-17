package exerciciosjavadois;

import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();

		        System.out.println("D�gitos do n�mero " + numero + ":");

		        //faz com que os d�gitos sejam separados corretamente
		        if (numero < 0) {
		            numero *= -1;
		        }

		        while (numero > 0) {
		            int digito = numero % 10; //pega o �ltimo d�gito do numero
		            System.out.println(digito);
		            numero /= 10; //reemove o �ltimo d�gito do numero
		        }

	}

}
