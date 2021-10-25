package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class PreguntaDAO {
	public static HashMap<Integer, Pregunta> leerPreguntasFichero(String nombreFichero){
		HashMap<Integer, Pregunta> preguntas = new HashMap<Integer, Pregunta>();
		BufferedReader buffer;
        String linea;
        int contador = 0;
		
		try {
            FileReader file = new FileReader("./"+nombreFichero);
            buffer = new BufferedReader(file);
            
            while ((linea=buffer.readLine()) != null) {
            	contador++;
                String cadenaCortada[]= linea.split("#", 0); 
                if(cadenaCortada.length == 5){
                    String enunciado = cadenaCortada[0];
                    String respuesta1 = cadenaCortada[1];
                    String respuesta2 = cadenaCortada[2];
                    String respuesta3 = cadenaCortada[3];
                    int correcta = Integer.parseInt(cadenaCortada[4]);
                    
                    Pregunta preguntaNueva = new Pregunta(enunciado, respuesta1, respuesta2, respuesta3, correcta);
                    preguntas.put(contador, preguntaNueva);  
                   
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return preguntas;
	}
	
	public static boolean escribirPreguntaFichero(Pregunta nueva, String nombreFichero) {
		BufferedWriter buffer;
        String linea;

        try {
            FileWriter file = new FileWriter(nombreFichero,true);
            
            buffer = new BufferedWriter(file);
            buffer.newLine();
            
            linea = nueva.getEnunciado()+" # "+nueva.getRespuesta1()+" # "+nueva.getRespuesta2()+" # "+nueva.getRespuesta3()+" # "+nueva.getCorrecta();
            buffer.write(linea);
            buffer.flush();
            
            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return false;
	}
}
