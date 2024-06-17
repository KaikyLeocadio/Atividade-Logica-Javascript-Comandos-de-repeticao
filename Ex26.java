package exerciciosjavadois;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        int somapares = 0;
		        int contador = 2; // Começa a partir do primeiro número par

		        System.out.println("Soma dos números pares entre 1 e " + numero + ":");

		        do {
		        	somapares += contador; // Adiciona o número par à soma
		            contador += 2; // Incrementa para o próximo número par
		        } while (contador <= numero);

		        System.out.println("A soma dos números pares é: " + somapares);
	}

}
