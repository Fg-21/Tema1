package parte1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		// Creamos variables
		double ptas;
		double op;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Preguntamos pesetas a convertir
		System.out.println("Pesetas");
		ptas = rd.nextDouble();

		// Operación de conversión
		op = ptas / 166;

		// Mostramos las conversión
		System.out.println(ptas + " pesetas son " + op + " euros");

		// Cerramos el scanner
		rd.close();
	}
}
