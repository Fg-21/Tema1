package parte1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Pedimos al usuario la edad
		System.out.println("Edad en años");
		// Abrimos Scanner
		Scanner sc = new Scanner(System.in);
		// Registramos la edad introducida por el usuario
		int edad = sc.nextInt();
		// Sumamos 1 año a la edad
		edad = edad + 1;
		// Mostramos la edad que tendra el usuario en 1 año
		System.out.println("El año que viene tendrás " + edad + " años");
		// Cerramos el scanner
		sc.close();

	}
}
