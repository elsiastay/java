import java.util.Scanner;

public class asignacionVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroentero;
        String texto;
        boolean esverdadero;
        double pii;

        System.out.print("Ingrese la variable de entero: ");
        numeroentero = input.nextInt();
     
        System.out.print("Ingrese la variable de texto: ");
        input.nextLine(); 
        texto = input.nextLine();

        System.out.print("Ingrese la varible de  lógico (true para Verdadero, false para Falso): ");
        esverdadero = input.nextBoolean();

        System.out.print("Ingrese la variable de real: ");
        pii = input.nextDouble();

        System.out.println("variable de entero " + numeroentero);
        System.out.println("variable de texto " + texto);
        System.out.println("variable de logico " + (esverdadero ? "Verdadero" : "Falso"));
        System.out.println("variable de real " + pii);
    }
}