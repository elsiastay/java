import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			double numero1, numero2, suma, resta, multiplicacion, division=0;

			System.out.print("Ingrese el primer número: ");
			numero1 = input.nextDouble();

			System.out.print("Ingrese el segundo número: ");
			numero2 = input.nextDouble();

			suma = numero1 + numero2;
			resta = numero1 - numero2;
			multiplicacion = numero1 * numero2;

			if (numero2 != 0) {
				System.out.println("No se puede dividir por cero.");
			    
			} else {
				division = numero1 / numero2;
			    
			}
			 System.out.println("Resultados de las operaciones:");
	         System.out.println("Suma: " + suma);
	         System.out.println("Resta: " + resta);
	         System.out.println("Multiplicación: " + multiplicacion);
	         System.out.println("División: " + division);
		}
    }
}
