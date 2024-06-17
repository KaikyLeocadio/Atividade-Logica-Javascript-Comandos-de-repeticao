package exerciciosjavadois;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        int totalIdades = 0;
		        int contador = 0;

		        System.out.println("Digite o nome e a idade das pessoas (digite 'fim' para encerrar):");

		        String nome;
		        while (true) {
		            System.out.print("Nome: ");
		            nome = scanner.nextLine();

		            if (nome.equalsIgnoreCase("fim")) {
		                break; //aceita fim de qualquer forma de case
		            }

		            System.out.print("Idade: ");
		            int idade = scanner.nextInt();
		            scanner.nextLine();

		            totalIdades += idade;
		            contador++;
		        }

		        if (contador > 0) {
		            double mediaIdades = (double) totalIdades / contador;
		            System.out.println("A média das idades das pessoas é: " + mediaIdades);
		        } else {
		            System.out.println("Nenhuma pessoa foi inserida para calcular a média das idades.");
		        }
	}

}
