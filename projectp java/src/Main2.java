import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Escribe en pantalla un número: ", keyboard);
//		 		y pulse ENTER
		int numero = keyboard.nextInt();
		boolean valors=true;
	
		while(valors) {
			if (numero == 1) {
				System.out.println("Gestores");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero == 2) {
				System.out.println("Clientes");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero==3) {
				System.out.println("Transferencias");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero==4) {
				System.out.println("Mensajes");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero==5) {
				System.out.println("Préstamos");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else {
				keyboard.close();
				valors=false;
				System.out.println("Salir");
			}	
		}
		
	}    
}
