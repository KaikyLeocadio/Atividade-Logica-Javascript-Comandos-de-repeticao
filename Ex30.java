package exerciciosjavadois;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        String nome;
		        int idade;
		        int somaidades = 0;
		        int contador = 0;

		        do {
		            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
		            nome = scanner.nextLine();

		            if (!nome.equalsIgnoreCase("fim")) {
		                System.out.print("Digite a idade de " + nome + ": ");
		                idade = scanner.nextInt();
		                scanner.nextLine(); // Limpar o buffer

		                somaidades += idade;
		                contador++;
		            }
		        } while (!nome.equalsIgnoreCase("fim"));

		        if (contador > 0) {
		            double mediaIdades = (double) somaidades / contador;
		            System.out.println("A m�dia das idades �: " + mediaIdades);
		        } else {
		            System.out.println("Nenhuma idade foi informada.");
		        }
	}

}
