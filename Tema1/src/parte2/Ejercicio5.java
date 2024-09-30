package parte2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
	/*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
	 * La aplicación debe mostrar cuántas horas, minutos y segundos 
	 * hay en el número de segundos introducidos por el usuario.*/
		
		//Creamos las variables
		double sec;
		
		//Abrimos scanner
		System.out.println();
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los segundos
		
		sec = rd.nextDouble();
		
		//Calculamos y mostramos horas minutos y segundos
		System.out.println("Hay " + (int) sec/3600 + " horas, " + (int) ((sec%3600)/60) + " minutos y " + (int) ((sec%3600)%60)/60 + " segundos");
		
	}
}
