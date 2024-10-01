package parte2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*La FILA (Federación Internacional de Lanzamiento de Algoritmo) 
		 *realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza,
		 *ganando quien consiga lanzarlo más lejos. 
		 *La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros 
		 *(con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en cm
		 *(sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
		 *Realiza un programa que solicite la longitud (en metros) de un lanzamiento 
		 *y muestre la parte entera correspondiente en centímetros. Utiliza la conversión de tipos.
*/
		
		//Variable de logitud en m
		double m;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos la longitud en m
		System.out.println("Longitud de lanzamiento:");
		m = rd.nextDouble();
		
		//Pasamos de m a cm y quitamos decimales
		System.out.println("Longitud en cm: " + (int) m*100);
		
		//Cerramos scanner
		rd.close();		
	}
}
