package exerciciosjavadois;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro para calcular o fatorial: ");
		        int numero = scanner.nextInt();

		        int fatorial = 1;
		        int contador = 1;

		        do {
		            fatorial *= contador; //multiplica o fatorial pelo contador
		            contador++;
		        } while (contador <= numero);

		        System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}

}
