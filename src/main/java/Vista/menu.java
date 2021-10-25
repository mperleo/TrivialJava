package Vista;

import java.util.Scanner;

public class menu {
	
	public static int menuOpciones() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		
		System.out.println("Indica una opcion:");
		System.out.println("1- Siguiente pregunta");
		System.out.println("2- Mostrar puntuación");
		System.out.println("3- Salir del juego y mostrar puntos ");
		opcion = sc.nextInt();
		
		return opcion;
	}
	
	public static int menuOpcionesInicio() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		
		System.out.println("Indica una opcion:");
		System.out.println("1- Emplezar Juego");
		System.out.println("2- Añadir pregunta");
		System.out.println("3- Salir");
		opcion = sc.nextInt();
		
		return opcion;
	}

}
