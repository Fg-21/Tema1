package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creamos variables
		double mm;
		double cm;
		double m;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos mm, cm y m
		System.out.println("Introduce milímetros");
		mm = rd.nextDouble();
		System.out.println("Introduce centímetros");
		cm = rd.nextDouble();
		System.out.println("Introduce metros");
		m = rd.nextDouble();
		
		
		//Mostramos la suma en cm
		System.out.println("Hay un total de " + mm/10 + cm + m*100);
		
		//Cerramos scanner
		rd.close();
	}
}
