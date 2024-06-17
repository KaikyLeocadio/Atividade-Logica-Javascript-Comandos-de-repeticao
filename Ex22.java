package exerciciosjavadois;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();

		        boolean primo = true;

		        if (numero <= 1) {
		        	primo = false;
		        } else {
		            int divisor = 2;
		      
		            do {
		                if (numero % divisor == 0) {
		                	primo = false; 
		                    break; 
		                }
		                divisor++;
		            } while (divisor <= Math.sqrt(numero)); //verificando at� a raiz quadrada do n�mero

		        }

		        if (primo) {
		            System.out.println(numero + " � um n�mero primo.");
		        } else {
		            System.out.println(numero + " n�o � um n�mero primo.");
		        }
	}

}
