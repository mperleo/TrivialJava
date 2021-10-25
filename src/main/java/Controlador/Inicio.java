package Controlador;

import Modelo.Pregunta;
import Modelo.PreguntaDAO;
import Vista.error;
import Vista.menu;
import Vista.preguntaNueva;

public class Inicio {
	public static void main(String args[]) {
		
		boolean seguir = true;
		
		while(seguir == true) {
			int opcion = menu.menuOpcionesInicio();
			
			switch (opcion) {
				case 1:
					Trivial.juego();
					break;
				case 2:
					Pregunta nueva = preguntaNueva.pedirDatos();
					PreguntaDAO.escribirPreguntaFichero(nueva, "preguntas.txt");
					break;
				case 3:
					seguir = false;
					break;
				default:
					error.mostrarError("Indica una opcion correcta");
					break;
			}
		}
		System.out.println("FIN DEL PROGRAMA");
	}
}
