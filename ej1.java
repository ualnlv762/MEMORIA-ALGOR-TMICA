package Algoritmica;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int resultado = Factorial(n);
            System.out.printf("El factorial de %d es %d.", n, resultado);
        }
        
        sc.close();
    }
    
    public static int Factorial(int n) {
        // Caso base: si n es 0, el factorial es 1
        if (n == 0) {
            return 1;
        }
        // Caso recursivo: si n > 0
        else {
            return n * Factorial(n - 1);
        }
    }
}
