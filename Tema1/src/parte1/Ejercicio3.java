package parte1;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	//Creamos las variables necesarias
	int añoActual;
	int añoNacimiento;
	int resta;
	//Pedimos el año actual al usuario
	System.out.println("Pon el año actual");
	//Abrimos Scanner
	Scanner rd = new Scanner(System.in);
	//Leemos el año actual
	añoActual = rd.nextInt();
	//Pedimos el año de nacimiento al Usuario
	System.out.println("Pon tu año de nacimiento");
	//Leemos el año de nacimiento
	añoNacimiento = rd.nextInt();
	//Restamos el año actual y el de nacimiento
	resta = añoActual - añoNacimiento;
	//Mostramos la edad del usuario
	System.out.println("Tu edad es de " + resta + " años");
	//Cerramos Scanner
	rd.close();
}

}
