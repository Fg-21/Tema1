package parte1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		//Creamos variables
		double m;
		double p;
		double opm;
		double opp;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario los kilos de manzanas y peras
		System.out.println("Kilos de manzanas:");
		m = rd.nextDouble();
		System.out.println("Kilos de peras");
		p = rd.nextDouble();
		
		//Operamos
		opm = m*2.35;
		opp = p*1.95;
		
		//Mostramos la cantidad de dinero ganado
		System.out.println("Ha ganado un total de " + opm + " euros en manzanas");
		System.out.println("Ha ganado un total de " + opp + " euros en peras");
		
		//Cerramos scanner
		rd.close();
	}
}
