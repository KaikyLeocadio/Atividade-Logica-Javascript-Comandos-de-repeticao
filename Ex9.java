package exerciciosjavadois;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int totalidades = 0; 
		        int contador = 0;
		        
		        System.out.println("Digite o nome e a idade das 5 pessoas:");

		        while (contador < 5) {
		            System.out.print("Nome da pessoa " + (contador + 1) + ": ");
		            String nome = scanner.next();

		            System.out.print("Idade da pessoa " + (contador + 1) + ": ");
		            int idade = scanner.nextInt();

		            totalidades += idade;
		            contador++;
		        }

		        double mediaidades = (double) totalidades / 5;

		        System.out.println("A média das idades das 5 pessoas é: " + mediaidades);
	}

}
