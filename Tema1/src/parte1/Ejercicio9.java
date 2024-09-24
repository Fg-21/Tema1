package parte1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		//Creamos variable
		int edad;
		
		//Abrimos scanner
		Scanner  rd = new Scanner(System.in);
		
		//Pedimos edad
		System.out.println("Edad");
		edad = rd.nextInt();
		
		//Comprobamos mayoria de edad
		System.out.println("¿Mayor de edad? " + (edad>= 18));
		//Cerramos scanner
		rd.close();
	}

}
