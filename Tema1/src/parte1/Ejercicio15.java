package parte1;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
	/*Escribe un programa en el que declares una constante IVA de valor igual a 21. 
	 * A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales)
	 * y calcula cuál será el precio final con el IVA aplicado.*/
		
		//Creamos variables
		final double iva = 0.21;
		double price;
		double op;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos el precio del objeto
		System.out.println("Precio");
		price = rd.nextDouble();
		
		//Operamos
		op = price*iva +price;
		
		//Mostramos el precio final
		System.out.println("El precio final es " + op);
		
		//Cerramos Scanner
		rd.close();
	}
}
