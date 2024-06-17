package exerciciosjavadois;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        int soma_idades = 0;

		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Digite o nome da pessoa " + i + ": ");
		            String nome = scanner.nextLine();

		            System.out.print("Digite a idade de " + nome + ": ");
		            int idade = scanner.nextInt();
		            scanner.nextLine();  // Limpar o buffer do scanner

		            soma_idades += idade;
		        }

		        double media_idades = (double) soma_idades / 5;

		        System.out.println("A média das idades é: " + media_idades);
	}

}
