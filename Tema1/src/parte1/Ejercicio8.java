package parte1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//Creamos las variables
		String name;
		int age;
		
		//Abrimos scanner
		Scanner  rd = new Scanner(System.in);
		
		//Pedimos los datos al usuario
		System.out.println("Nombre");
		name = rd.next();
		System.out.println("Edad");
		age = rd.nextInt();
		
		//Mostramos los datos
		System.out.println("Hola " + name + ", tienes " + age +  " años ¡qué mayor eres!");
		
		//Cerramos scanner
		rd.close();
	}
}
