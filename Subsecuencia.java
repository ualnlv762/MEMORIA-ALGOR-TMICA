package Algoritmica;

public class Subsecuencia {
	
	private int[] array;
	private int primer;
	private int ultimo;
	private int suma;
	
	public Subsecuencia(int numeroElementos) {
		
		this.array = new int[numeroElementos];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 199) - 99;
		}
		
		this.primer = 0;
		this.ultimo = 0;
		this.suma = 0;
	}
	
	public Subsecuencia(int[] arrayEnteros) {
		
		this.array = new int[arrayEnteros.length];
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			this.array[i] = arrayEnteros[i];
		}
		
		this.primer = 0;
		this.ultimo = 0;
		this.suma = 0;
	}
	
	public void SubsecuenciaFuerzaBruta() {
		
		int maxSum = 0;
		int seqStart = 0;
		int seqEnd = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i; j < array.length; j++) {
				
				int thisSum = 0;
				
				for (int k = i; k <= j; k++) {
					thisSum = thisSum + array[k];
				}
				
				if (thisSum > maxSum) {
					maxSum = thisSum;
					seqStart = i;
					seqEnd = j;
				}
			}
		}
		
		this.primer = seqStart;
		this.ultimo = seqEnd;
		this.suma = maxSum;
	}
	
	public void SubsecuenciaMejorado() {
		
		int maxSum = 0;
		int seqStart = 0;
		int seqEnd = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			int thisSum = 0;
			
			for (int j = i; j < array.length; j++) {
				
				thisSum = thisSum + array[j];
				
				if (thisSum > maxSum) {
					maxSum = thisSum;
					seqStart = i;
					seqEnd = j;
				}
			}
		}
		
		this.primer = seqStart;
		this.ultimo = seqEnd;
		this.suma = maxSum;
	}
	
	public void SubsecuenciaLineal() {
		
		int maxSum = 0;
		int thisSum = 0;
		int seqStart = 0;
		int seqEnd = 0;
		int i = 0;
		
		for (int j = 0; j < array.length; j++) {
			
			thisSum = thisSum + array[j];
			
			if (thisSum > maxSum) {
				maxSum = thisSum;
				seqStart = i;
				seqEnd = j;
			} else if (thisSum < 0) {
				i = j + 1;
				thisSum = 0;
			}
		}
		
		this.primer = seqStart;
		this.ultimo = seqEnd;
		this.suma = maxSum;
	}
	
	public int getPrimer() {
		return primer;
	}
	
	public int getUltimo() {
		return ultimo;
	}
	
	public int getSuma() {
		return suma;
	}
	
	public void mostrarArray() {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
		
		System.out.println();
	}
}