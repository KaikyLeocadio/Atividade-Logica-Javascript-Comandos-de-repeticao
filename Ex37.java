package exerciciosjavadois;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um n�mero inteiro: ");
		        int numero = scanner.nextInt();
		        boolean primo = true;

		        if (numero <= 1) {
		        	primo = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(numero); i++) {
		                if (numero % i == 0) {
		                	primo = false;
		                    break;
		                }
		            }
		        }

		        if (primo) {
		            System.out.println(numero + " � um n�mero primo.");
		        } else {
		            System.out.println(numero + " n�o � um n�mero primo.");
		        }
	}

}
