package matrizes_mutidimensionais;

import java.util.Iterator;
import java.util.Random;

public class atvd01 {

	public static void main(String[] args) {
		int [][] matriz = new int [4][4];
		int maior = 0;
		int menor = 1;
		int linha = 0;
		int coluna = 0;
		
		Random numRandom = new Random();//numero aleratorio
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numRandom.nextInt(10);//gera numeros aleatórios de 0 ate 20
			
				if(maior < matriz[i][j]) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
				if(menor > matriz[i][j]) {
					menor = matriz[i][j];
				}
				
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " - ");
			}
			System.out.println();
		}
		System.out.println("menor valor :" + menor);
		System.out.println("Maior valor:" + maior);
		System.out.println("Linha:" + linha);
		System.out.println("Loluna:" + coluna);
	}

}
