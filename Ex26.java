package exerciciosjavadois;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();

		        int somapares = 0;
		        int contador = 2; // Come�a a partir do primeiro n�mero par

		        System.out.println("Soma dos n�meros pares entre 1 e " + numero + ":");

		        do {
		        	somapares += contador; // Adiciona o n�mero par � soma
		            contador += 2; // Incrementa para o pr�ximo n�mero par
		        } while (contador <= numero);

		        System.out.println("A soma dos n�meros pares �: " + somapares);
	}

}
