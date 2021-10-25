package Vista;

import java.util.Scanner;

import Modelo.Pregunta;

public class preguntaResponder {
	public static int pregnuntar(Pregunta pregunta) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿"+pregunta.getEnunciado()+"?");
		System.out.println("1- "+pregunta.getRespuesta1());
		System.out.println("2- "+pregunta.getRespuesta2());
		System.out.println("3- "+pregunta.getRespuesta3());
		System.out.print(">");
		int respuesta = sc.nextInt();
		
		return respuesta;		
	}
}
