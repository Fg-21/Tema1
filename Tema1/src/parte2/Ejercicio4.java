package parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
/*Dado el siguiente polinomio de segundo grado:
y=ax2+bx+c
Crea un programa que pida los coeficientes a, b y c, así como el valor de x, 
y calcula el valor correspondiente de y.*/
		
		//Creamos las variables
		double a;
		double b;
		double c;
		double x;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los números a operar
		System.out.println("Dale valor a la a");
		a = rd.nextDouble();
		System.out.println("Dale valor a la b");
		b = rd.nextDouble();
		System.out.println("Dale valor a la c");
		c = rd.nextDouble();
		System.out.println("Dale valor a la x");
		x = rd.nextDouble();
		
		//Operamos y decimos el resultado
		System.out.println("El resultado de la y es " + (a*x*2+b*x+c));
		
		//Cerramos scaner
		rd.close();
	}
}
