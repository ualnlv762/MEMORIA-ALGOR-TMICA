package Algoritmica;
import java.util.Scanner;
public class ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer entero: ");
		int m = sc.nextInt();
		
		System.out.println("Ingrese el segundo entero: ");
		int n = sc.nextInt();
		
		if (n < 0 || m < 0) {
			System.out.println("El número debe ser positivo.");
		} else {
			int resultado = MCM(m, n);
			System.out.printf("El maximo comun divisor de %d y %d es %d.", m, n, resultado);
		}
		
		sc.close();
    }
        
	public static int MCM(int m, int n) {
        if (n <= m && m % n == 0) {
            return n;
        } 
        else if (m < n) {
            return MCM(n, m); 
        } 
        else {
            return MCM(n, m % n);
        }
    }
}
