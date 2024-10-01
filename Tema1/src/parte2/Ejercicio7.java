package parte2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular
		 * el importe que hay que cobrar en la taquilla por la compra de una serie de entradas
		 * (cuyo número será introducido por el usuario). Existen dos tipos de entradas:
		 * infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€. 
		 * En el caso de que el importe total sea igual o superior a 100€, 
		 * se aplicará automáticamente un bono descuento del 5%.*/
		
		//Entrada infantil
		final double INF = 15.5;
		int nInf;
		
		//Entrada adulto
		final double ADU = 20;
		int nAdu;
		
		//Total sin bono
		double total;
		
		//Bono +100E;
		final double BON = 0.05;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos Nº entradas
		System.out.println("Entradas infantiles");
		nInf = rd.nextInt();
		System.out.println("Entradas adultos");
		nAdu = rd.nextInt();
		
		//Calculamos precio
		total = nInf*INF + nAdu*ADU;
		System.out.println((total>100 ? "Se ha aplicado el bono, las entradas son: " + (total-total*BON) + " Euros" : "No se aplicó ningun bono, las entradas son: " + total + " Euros" ) );
	
		//Cerramos scanner
		rd.close();
	}
}
