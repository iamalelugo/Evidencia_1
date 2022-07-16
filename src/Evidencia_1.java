/**
 * 
 */

/**
 * @author alelugo
 *
 */

//Libreria 
import java.util.Scanner;

//Espacio de nombre
public class Evidencia_1 {

	/**
	 * @param args
	 */
	
	//Metodo main
	public static void main(String[] args) {
		
		Scanner Read = new Scanner(System.in);
	
		System.out.println("Ingresa tu nombre: ");
		 String name = Read.nextLine();
		
		System.out.println("Ingresa un numero: ");
		int number = Read.nextInt();
		
		System.out.println("Ingresa un decimal: ");
		double decimal = Read.nextDouble();
		
		double result = number + decimal;
		
		System.out.println("Hola " + name + ", el resultado de la suma entre " 
		+ number + " y " + decimal +" es " + result);
	}

}
