package exerciciosjavadois;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        int divisor = 2;

		        boolean primo = true;

		        while (divisor < numero) {
		            if (numero % divisor == 0) {
		                primo = false; 
		                break; 
		            }
		            divisor++;
		        }

		        if (primo && numero > 1) {
		            System.out.println(numero + " é um número primo.");
		        } else {
		            System.out.println(numero + " não é um número primo.");
		        }

		    }
		}
