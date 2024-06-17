package exerciciosjavadois;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        int contador = 0;
		        int totalIdades = 0;

		        System.out.println("Digite o nome e a idade das pessoas:");

		        do {
		            System.out.print("Nome: ");
		            String nome = scanner.nextLine();

		            System.out.print("Idade: ");
		            int idade = scanner.nextInt();
		            scanner.nextLine(); //quebra de linha

		            totalIdades += idade;
		            contador++; 
		        } while (contador < 5);

		        double mediaIdades = (double) totalIdades / contador;

		        System.out.println("A média das idades das 5 pessoas é: " + mediaIdades);
	}

}
