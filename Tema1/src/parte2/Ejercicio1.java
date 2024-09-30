package parte2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida como entrada un número con decimales y lo
		 * muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
		 */

		// Creamos variables
		double num;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos el número
		System.out.println("Pon un número con decimales para redondear");
		num = rd.nextDouble();

		// Redondeamos
		System.out.println("El número redondeado es " + (int) (num + 0.5));

		// Cerramos scanner
		rd.close();
	}
}
