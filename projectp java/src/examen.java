
public class examen {

	public static void main(String[] args) {
//		escribe un programa en Java que realice las siguientes tareas:

	
		//1. Mostrar por pantalla “Buenos días”.
		      System.out.println("buenos dias");
//		      2. Mostrar por pantalla la expresión 8*13 como texto.
		      System.out.println("8*3");
//		  	3. Mostrar por pantalla el resultado de la multiplicación 8*13.
		      System.out.println(8*13);
//		      imprime por pantalla 1 + 2 + 3 = 6, siendo:
//		    	  1 + 2 + 3 = una cadena de texto literal.
//		    	  6 el resultado de realizar la operación matemática anterior.
		      System.out.println("1+2+3");
		      System.out.println(1+2+3);


//		      escribe un programa que declare tres variables de nombre a, b y c, con
//		      valores
//		      de tipo entero. A continuación:
		      int a = 2;
		      int b = 4;
		      int c = 6;
//		      1. Escribe una sentencia que muestre por pantalla la suma de las tres 
		      System.out.println(a+b+c);

//		      2. Cambia el valor de la variable c.
		      c = 8;
//		      3. Escribe de nuevo una sentencia que muestre por pantalla la suma de las                                                    //               tres variables utilizando System.out.printf.
		      System.out.printf("%d + %d + %d = 14", a, b, c).println();
//		      escribe un programa que almacene tres ángulos de un triángulo en
//		      variables de
//		      tipo entero (angulo1, angulo2 y angulo3)
		      int angulo1 = 60;
		      int angulo2 = 15;
		      int angulo3 = 105;
		     //Crea un condicional que compruebe si
//		      esos
//		      tres ángulos juntos pueden formar un triángulo (los ángulos de un triángulo 
		    	      
		    //  suman  siempre 180 grados).
		      if (angulo1 + angulo2 + angulo3 == 180) {System.out.println("los tres angulos forman un trangulo");}
//		      Ejercicio5: escribe un programa que dado 4 números imprima por pantalla cuál 
//		     es el mayor
		      int little = 1;
		      int medium = 2;
		      int large = 3;
		      int bigger = 4;
		      if ((little > medium ) && (little > large)) {
		    	  System.out.println("El little es el mayor");
		      } 
	}

}
