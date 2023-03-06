import java.util.Scanner;

public class Pruebascanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		keyboard.close();
		System.out.printf("El triple es %d",numero *3).println();
		
		
		if (numero ==1) {
		  System.out.println("mensajes");
		   numero=keyboard.nextInt();
		
		}

	}
}
