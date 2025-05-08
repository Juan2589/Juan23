import java.util.Scanner;

public class compararDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Verifica si el primero es mayor que el segundo
        if (num1 > num2) {
            int diferencia = num1 - num2;
            System.out.println("El primer número es mayor.");
            System.out.println("La diferencia entre ambos es: " + diferencia);
        }

        // Verifica si el primero NO es mayor que el segundo
        if (num1 <= num2) {
            System.out.println("El primer número NO es mayor que el segundo.");
        }

        scanner.close();
    }
}
