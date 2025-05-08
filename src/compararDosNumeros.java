import java.util.Scanner;

public class CompararDosNumeros { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita los dos números
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Verifica si el primero es mayor que el segundo
        if (primerNumero > segundoNumero) {
            int diferencia = primerNumero - segundoNumero;
            System.out.println("El primer número es mayor.");
            System.out.println("La diferencia entre ambos es: " + diferencia);
        } else if (primerNumero == segundoNumero) {
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println("El primer número NO es mayor que el segundo.");
        }

        scanner.close();
    }
}
