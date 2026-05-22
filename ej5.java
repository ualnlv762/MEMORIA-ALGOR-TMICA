package Algoritmica;
import java.util.Scanner;
public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer entero: ");
		int m = sc.nextInt();
		
		System.out.println("Ingrese el segundo entero: ");
		int n = sc.nextInt();
		
		if (n < 0 || m < 0) {
			System.out.println("El número debe ser positivo.");
		} else {
			int resultado = Ackerman(m, n);
			System.out.printf("El ackerman de %d y %d es %d.", m, n, resultado);
		}
		
		sc.close();
    }
        
	public static int Ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } 
        else if (m > 0 && n == 0) {
            return Ackerman(m - 1, 1); 
        } 
        else {
            return Ackerman(m - 1, Ackerman(m, n - 1));
        }
    }
}
