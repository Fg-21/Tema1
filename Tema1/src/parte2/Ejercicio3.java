package parte2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*Modifica el ejercicio anterior para que, indicando dos números, 
		 * por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a num1 para que
		 * sea múltiplo de num2.*/
		
		//Creamos variables
		int num1;
		int num2;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el número
		System.out.println("Pon el número 1");
		num1 = rd.nextInt();
		System.out.println("Pon el número 2");
		num2 = rd.nextInt();
		
		//Averiguamos cuanto hay que sumarle para que sea múltiplo de 7
		System.out.println("Hay que sumarle " + (num2-(num1%num2)%num2));
		
		//Cerramos scanner
		rd.close();
	}
}
