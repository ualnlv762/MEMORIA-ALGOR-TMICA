package Algoritmica;

import java.util.Scanner;

public class MatrizOrdenadaPorFilas {

	int tamaño;
	int matriz[][];
	int matrizOrdenada[][];

	public MatrizOrdenadaPorFilas(int tamaño) {
		this.tamaño = tamaño;
		this.matriz = new int[tamaño][tamaño];
		this.matrizOrdenada = new int[tamaño][tamaño];
	}

	public void rellenarMatriz() {
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
				matrizOrdenada[i][j] = matriz[i][j];
			}
		}
	}

	public void mostrarMatriz() {
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				System.out.print("[" + matrizOrdenada[i][j] + "]");
			}
			System.out.println("");
		}
	}

	public void ordenarFilasPorSeleccion() {
		for (int fila = 0; fila < matriz.length; fila++) {

			for (int i = 0; i < matrizOrdenada[fila].length - 1; i++) {

				int posicionMenor = i;

				for (int j = i + 1; j < matrizOrdenada[fila].length; j++) {

					if (matrizOrdenada[fila][j] < matrizOrdenada[fila][posicionMenor]) {
						posicionMenor = j;
					}
				}

				int temp = matrizOrdenada[fila][i];
				matrizOrdenada[fila][i] = matriz[fila][posicionMenor];
				matrizOrdenada[fila][posicionMenor] = temp;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué tamaño tendrá la matriz? (nxn)");
		int tamaño = sc.nextInt();

		MatrizOrdenadaPorFilas matriz = new MatrizOrdenadaPorFilas(tamaño);

		matriz.rellenarMatriz();

		System.out.println("La matriz no ordenada es:");
		matriz.mostrarMatriz();

		matriz.ordenarFilasPorSeleccion();

		System.out.println("Matriz tras ser ordenada:");
		matriz.mostrarMatriz();

		sc.close();

	}
}
