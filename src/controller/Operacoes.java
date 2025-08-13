package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
	public void tempo(int[] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
		
		double tempoInicial = System.nanoTime();
		
		for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[i];
        }
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS - 10^-9 s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		//por ter um número muito pequeno está mostrando em notação, por isso substiui o print
		//System.out.println("Tamanho " + vetor.length + " => " + tempoTotal + " s.");
		System.out.printf("Tamanho %d => %.8f s%n", vetor.length, tempoTotal);

	}
}
