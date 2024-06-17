package exerciciosjavadois;

import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int somaIdades = 0;
		        int contadorPessoas = 0;

		        System.out.println("Digite o nome e a idade das pessoas (para encerrar, digite 'fim' no nome):");

		        for (;;) { // Loop infinito
		            System.out.print("Nome: ");
		            String nome = scanner.nextLine();

		            if (nome.equalsIgnoreCase("fim")) {
		                break; // Sai do loop se o nome for "fim"
		            }

		            System.out.print("Idade: ");
		            int idade = scanner.nextInt();
		            scanner.nextLine(); // Limpa o buffer do scanner

		            somaIdades += idade;
		            contadorPessoas++;
		        }

		        if (contadorPessoas > 0) {
		            double mediaIdades = (double) somaIdades / contadorPessoas;
		            System.out.println("A média das idades é: " + mediaIdades);
		        } else {
		            System.out.println("Nenhuma pessoa foi adicionada para cálculo da média.");
		        }
	}

}
