package Algoritmica;

public class TiempoSubsecuenciaApp {

	public static void main(String[] args) {

		int tamaño = 32;
		int repeticiones = 10;

		Subsecuencia subsecuencia = new Subsecuencia(tamaño);

		long tiempoFuerzaBruta = 0;
		long tiempoMejorado = 0;
		long tiempoLineal = 0;

		for (int i = 0; i < repeticiones; i++) {

			long inicio = System.nanoTime();

			subsecuencia.SubsecuenciaFuerzaBruta();

			long fin = System.nanoTime();

			tiempoFuerzaBruta = tiempoFuerzaBruta + (fin - inicio);
		}

		for (int i = 0; i < repeticiones; i++) {

			long inicio = System.nanoTime();

			subsecuencia.SubsecuenciaMejorado();

			long fin = System.nanoTime();

			tiempoMejorado = tiempoMejorado + (fin - inicio);
		}

		for (int i = 0; i < repeticiones; i++) {

			long inicio = System.nanoTime();

			subsecuencia.SubsecuenciaLineal();

			long fin = System.nanoTime();

			tiempoLineal = tiempoLineal + (fin - inicio);
		}

		long mediaFuerzaBruta = tiempoFuerzaBruta / repeticiones;
		long mediaMejorado = tiempoMejorado / repeticiones;
		long mediaLineal = tiempoLineal / repeticiones;

		System.out.println("Tamaño del array: " + tamaño);
		System.out.println("Tiempo medio Fuerza Bruta: " + mediaFuerzaBruta + " ns");
		System.out.println("Tiempo medio Mejorado: " + mediaMejorado + " ns");
		System.out.println("Tiempo medio Lineal: " + mediaLineal + " ns");
	}
}
