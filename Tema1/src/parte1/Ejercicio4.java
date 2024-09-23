package parte1;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	//Creamos variables a usar
	double nota1;
	double nota2;
	double op;
	//Abrimos scanner
	Scanner rd = new Scanner(System.in);
	//Pedimos nota 1 con decimales
	System.out.println("Pon la primera nota");
	//Leemos la nota introcucida por consola
	nota1 = rd.nextDouble();
	//Pedimos nota 2 con decimales
	System.out.println("Pon la segunda nota");
	//Leemos la nota introcucida por consola
	nota2 = rd.nextDouble();
	//Hacemos la media de las 2 notas y las mostramos por pantalla
	op = (nota1 + nota2)/2;
	System.out.println("La media de las notas es " + op);
	//Cerramos el scanner
	rd.close();
}
}
