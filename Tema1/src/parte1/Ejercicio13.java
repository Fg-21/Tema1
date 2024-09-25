package parte1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		/*Diseñar un algoritmo que nos indique si podemos salir a la calle. 
		Existen aspectos que influirán en esta decisión: 
		solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
		Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle:
		el hecho de tener que ir a la biblioteca.
		Solicitar al usuario (mediante un booleano) si llueve,
		si ha finalizado las tareas y si necesita ir a la biblioteca.
		El algoritmo debe mostrar con booleano (true o false) si es posible salir a la calle.*/
		
		//Creamos variables
		boolean rain;
		boolean hw;
		boolean lib;  
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos lluvia, tareas y biblioteca
		System.out.println("¿Está lloviendo?");
		rain = rd.nextBoolean();
		System.out.println("¿Están las tareas hechas?");
		hw = rd.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");
		lib = rd.nextBoolean();
		
		//Creamos las posibilidades con booleanos
		System.out.println((!rain && hw || lib));
		
		//Cerramos scanner
		rd.close();
	}
}
