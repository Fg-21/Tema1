package parte1;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {

	//Creamos las variables
	double radio;
	double longitud;
	double area;
	
	//Abrimos el scanner
	Scanner rd = new Scanner(System.in);
	
	//Pedimos al usuario el radio
	System.out.println("Introduce el radio de tu circunferencia");
	radio = rd.nextDouble();
	
	//Cálculo de la Longitud
	longitud = 2*Math.PI*radio;
	System.out.println("La longitud de tu circenferencia es de " + longitud);
	
	//Cálculo del área
	area = Math.PI*radio*radio;
	System.out.println("El área de tu circunferencia es de " + area);
	
	//Cerramos el scanner
	rd.close();
	
	
}
}
