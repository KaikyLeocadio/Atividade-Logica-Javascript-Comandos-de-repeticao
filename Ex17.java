package exerciciosjavadois;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int numero = 1;
		        int soma = 0;

		        System.out.println("Calculando a soma dos números de 1 a 100:");

		        do {
		            soma += numero; 
		            numero++; 
		        } while (numero <= 100);

		        System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
