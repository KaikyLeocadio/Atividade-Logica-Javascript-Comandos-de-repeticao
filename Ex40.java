package exerciciosjavadois;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int limite = 20;
		        int numero1 = 0;
		        int numero2 = 1;

		        System.out.println("Os primeiros " + limite + " n�meros da sequ�ncia de Fibonacci s�o:");
		        System.out.print(numero1 + " " + numero2);

		        for (int i = 2; i < limite; i++) {
		            int proximonumero = numero1 + numero2;
		            System.out.print(" " + proximonumero);
		            numero1 = numero2;
		            numero2 = proximonumero;
		        }
	}

}
