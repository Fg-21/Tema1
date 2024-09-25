package parte1;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras).
 *  El programa debe mostrar la nota media del curso en el boletín de calificaciones (parte entera)
 *  y como se usa en el expediente académico (con decimales).*/
		
		//Creamos variables
		int nota1;
		int nota2;
		int nota3;
		int opbole;
		double opacad;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos las notas
		System.out.println("Nota 1º trimestre");
		nota1 = rd.nextInt();
		System.out.println("Nota 2º trimestre");
		nota2 = rd.nextInt();
		System.out.println("Nota 3º trimestre");
		nota3 = rd.nextInt();
		
		//Operamos la media
		opbole = (nota1 + nota2 + nota3)/3;
		opacad = (double) (nota1 + nota2 + nota3)/3;
		
		//Mostramos las medias
		System.out.println("Nota de boletin: " + opbole);
		System.out.println("Nota académica: " + opacad);
		
		//Cerramos Scanner
		rd.close();
	}
}
