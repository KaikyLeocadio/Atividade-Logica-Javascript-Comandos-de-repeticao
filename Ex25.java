package exerciciosjavadois;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int limite = 20;
		        int numeroanterior = 0;
		        int numeroatual = 1;
		        int contador = 0;

		        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

		        do {
		            System.out.print(numeroanterior + " ");
		            int proximoNumero = numeroanterior + numeroatual;
		            numeroanterior = numeroatual;
		            numeroatual = proximoNumero;
		            contador++;
		        } while (contador < limite);
	}

}
