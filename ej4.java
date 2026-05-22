package Algoritmica;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el grado del polinomio (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el valor de x: ");
        double x = sc.nextDouble();
        
        if (n < 0) {
            System.out.println("El grado n debe ser no negativo.");
        } else {
            System.out.printf("Resultado: %.4f\n", Legendre(n, x));
        }
        
        sc.close();
    }

    public static double Legendre(int n, double x) {
        if (n == 0) {
            return 1.0;
        } else if (n == 1) {
            return x;
        } else {
            return ((2.0 * n - 1.0) / n) * x * Legendre(n - 1, x) - ((n - 1.0) / n) * Legendre(n - 2, x);
        }
    }
}
