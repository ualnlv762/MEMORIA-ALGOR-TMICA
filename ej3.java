package Algoritmica;
import java.util.Scanner;
public class ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entero: ");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("El número debe ser positivo.");
		} else {
			int resultado = Fibonacci(n);
			System.out.printf("El fibonacci de %d es %d.", n, resultado);
		}
		
		sc.close();
    }
        
    public static int Fibonacci(int n) {
        // Caso base: si n es 0, el factorial es 1
        if (n == 0|| n == 1) {
            return 1;
        } 
        // Caso recursivo: si n > 0
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

}


