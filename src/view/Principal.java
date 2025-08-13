package view;

import controller.Operacoes;

public class Principal {

	public static void main(String[] args) {
        Operacoes c = new Operacoes();
		
        int[] v1 = new int[1000];
        int[] v2 = new int[10000];
        int[] v3 = new int[100000];

        c.tempo(v1);
        c.tempo(v2);
        c.tempo(v3);
    }

}
