package exerciciosjavadois;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int contador = 0;
		        int soma = 0;

		        System.out.println("Digite 5 n�meros inteiros:");

		        do {
		            System.out.print("N�mero " + (contador + 1) + ": ");
		            int numero = scanner.nextInt();

		            soma += numero;
		            contador++;
		        } while (contador < 5);

		        //calculo
		        double media = (double) soma / 5;

		        System.out.println("A m�dia dos 5 n�meros �: " + media);
	}

}
