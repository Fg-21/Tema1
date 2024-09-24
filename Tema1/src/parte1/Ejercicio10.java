package parte1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		//Creamos las variables
		int num;
		
		//Abrimos Scanner
		Scanner  rd = new Scanner(System.in);
		
		//Pedimos el número
		System.out.println("Pon un número");
		num = rd.nextInt();
		
		//Comprobamos par
		System.out.println("¿Par? " + (num % 2 == 0));
		//Cerramos scanner
		rd.close();
	}
}
