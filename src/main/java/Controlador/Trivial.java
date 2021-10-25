package Controlador;

import java.util.HashMap;

import Modelo.Pregunta;
import Modelo.PreguntaDAO;
import Vista.error;
import Vista.menu;
import Vista.preguntaResponder;
import Vista.preguntaResultado;
import Vista.verPuntos;

public class Trivial {
	public static void juego() {
		HashMap<Integer, Pregunta> preguntas = PreguntaDAO.leerPreguntasFichero("preguntas.txt");
		int puntos =0;
		
		boolean seguir = true;
		
		while(seguir == true) {
			int opcion = menu.menuOpciones();
			
			switch (opcion) {
				case 1:
					int aleatorio = (int) Math.floor(Math.random()*preguntas.size() + 1);
					
					Pregunta pregunta = preguntas.get(aleatorio);
					int respuesta = preguntaResponder.pregnuntar(pregunta);
					if(respuesta == pregunta.getCorrecta()) {
						puntos++;
						preguntaResultado.respuestaCorrecta(puntos);
					}
					else {
						preguntaResultado.respuestaIncorrecta(puntos);
					}
					break;
				case 2:
					verPuntos.mostrarPuntos(puntos);
					break;
				case 3:
					verPuntos.mostrarPuntos(puntos);
					seguir = false;
					break;
				default:
					error.mostrarError("Indica una opcion correcta");
					break;
			}
		}
	}
	
}
