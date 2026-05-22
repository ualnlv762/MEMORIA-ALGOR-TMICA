package Algoritmica;
import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        int numero = sc.nextInt();
        
        System.out.println("Hexadecimal: " + convertirBase(numero, 16));
        
        System.out.print("Introduce una base B (B < 10): ");
        int baseB = sc.nextInt();
        System.out.println("Base " + baseB + ": " + convertirBase(numero, baseB));
        
        sc.close();
    }

    public static String convertirBase(int n, int base) {
        char[] digitos = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if (n < base) {
            return String.valueOf(digitos[n]);
        } else {
            return convertirBase(n / base, base) + digitos[n % base];
        }
    }
}