package parte1;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Programa que pida un número al usuario y a continuación lo muestre.
	
	public static void main(String[] args) {
		//Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		//Pide el número a poner por pantalla
		System.out.println("Pon un número");
		//Registra el número introducido por teclado
		int numero = sc.nextInt();
		//Muestra el número introducido por el tecado
		System.out.println(numero);
		//Cerramos el scanner
		sc.close();
		}
	}

