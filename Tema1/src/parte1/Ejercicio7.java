package parte1;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		//Creamos las variables
		String name;
		String adr;
		int phone;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario los datos
		System.out.println("Nombre");
		name = rd.nextLine();
		System.out.println("Dirección");
		adr = rd.nextLine();
		System.out.println("Número de teléfono");
		phone = rd.nextInt();
		
		//Mostramos los datos
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + adr);
		System.out.println("Teléfono: " + phone);
		
		//Cerramos el scanner
		rd.close();
	}
}
