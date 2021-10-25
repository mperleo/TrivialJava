package Vista;

import java.util.Scanner;

import Modelo.Pregunta;

public class preguntaNueva {
	public static Pregunta pedirDatos() {
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		
		System.out.println("Indica el enunciado:");
		System.out.print(">");
		String enunciado = sc.next();
		
		System.out.println("Primera respuesta");
		System.out.print("1 >");
		String respuesta1  = sc.next();
		
		System.out.println("Segunda respuesta");
		System.out.print("2 >");
		String respuesta2 = sc.next();
		
		System.out.println("Tercera respuesta");
		System.out.print("3 >");
		String respuesta3 = sc.next();
		
		// pido al usuario la opcion correcta hasta quue indica una valida
		do {
			
			System.out.println("Numero de respuesta correcta");
			System.out.print(">");
	        int correcta = sc.nextInt();
	        
	        if(correcta > 0 && correcta < 4) 
	        	seguir = false;
	        else 
	        	System.out.println("Indica un número entre 1 y 3");
	        
		}while(seguir == true);
		
		System.out.println("Numero de respuesta correcta");
		System.out.print(">");
        int correcta = sc.nextInt();
        
        return new Pregunta(enunciado, respuesta1, respuesta2, respuesta3, correcta);
	}
}
