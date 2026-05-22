package Algoritmica;

public class TiemposMatrizEnterosCuadradaApp {

	public static void main(String[] args) {

		int tamaño = 0;
		long tiempos[] = new long[11];

		System.out.println("Tiempo que tarda en 32x32");
		tamaño = 32;
		int matriz[][] = new int[tamaño][tamaño];
		long inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		long mayor = tiempos[0];
		int posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		long suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		long media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es " + media);

		System.out.println("Tiempo que tarda en 64x64");
		tamaño = 64;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 128x128");
		tamaño = 128;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 256x256");
		tamaño = 256;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 512x512");
		tamaño = 512;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 1024x1024");
		tamaño = 1024;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 2048x2048");
		tamaño = 2048;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 4096x4096");
		tamaño = 4096;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("");
		System.out.println("La media es" + media);
		System.out.println("Tiempo que tarda en 8192x8192");
		tamaño = 8192;
		matriz = new int[tamaño][tamaño];
		inicio = System.nanoTime();

		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < tamaño; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}

			long fin = System.nanoTime();
			long tiempo = fin - inicio;
			tiempos[t] = tiempo;
		}
		mayor = tiempos[0];
		posicionMayor = 0;

		for (int i = 1; i < 10; i++) {
			if (tiempos[i] > mayor) {
				mayor = tiempos[i];
				posicionMayor = i;
			}
		}
		suma = 0;
		for (int i = 0; i < 10; i++) {
			suma = suma + tiempos[i];
		}
		media = suma / 9;
		tiempos[10] = media;
		tiempos[posicionMayor] = media;
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + tiempos[i] + "ns]");
		}
		System.out.println("La media es" + media);
	}
}