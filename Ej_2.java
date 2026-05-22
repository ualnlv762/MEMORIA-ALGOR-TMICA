package Algoritmica;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base: ");
        int base = sc.nextInt();
        
        System.out.print("Exponente: ");
        int exponente = sc.nextInt();
        
        int resultado = Potencia(base, exponente);
        System.out.print("Resultado: " + resultado);
        
        sc.close();
    }

    public static int Potencia(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Potencia(x, n - 1);
    }
}