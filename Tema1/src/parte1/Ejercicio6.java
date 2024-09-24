package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Creamos las variables
		int num1;
		int num2;
		int suma;
		int resta;
		int multi;
		int divi;
		
		//Creamos Scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los 2 números al usuario
		System.out.println("Pon el primer número");
		num1 = rd.nextInt();
		System.out.println("Pon el segundo número");
		num2 = rd.nextInt();
		
		//Sumamos, restamos, multiplicamos y dividimos
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;
		
		//Mostramos las operaciones
		System.out.println(num1 + "+" + num2 + "=" + suma);
		System.out.println(num1 + "-" + num2 + "=" + resta);
		System.out.println(num1 + "*" + num2 + "=" + multi);
		System.out.println(num1 + "/" + num2 + "=" + divi);
		
		//Cerramos el scanner
		rd.close();		
	}

}
