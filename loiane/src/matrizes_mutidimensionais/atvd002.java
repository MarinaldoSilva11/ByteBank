package matrizes_mutidimensionais;

import java.util.Random;

public class atvd022 {

    public static void main(String[] args) {

        int tabela[][] = new int [10][10];
        Random random = new Random(9);//gera numer
        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;
        int maiorC7 = 0;
        int menorC7 = Integer.MAX_VALUE;
        int indexColunaMaior =0;
        int indexColunaMenor =0;
        int linha5 = 5;
        int coluna7 = 7;

        for(int i = 0; i< tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                tabela[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print(tabela[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println();

        for(int coluna = 0; coluna < tabela[linha5].length; coluna++) {

            if(tabela[linha5][coluna] > maiorL5) {
                maiorL5 = tabela[linha5][coluna];
                indexColunaMaior = coluna;
            }

            if(tabela[linha5][coluna] < menorL5) {
                menorL5 = tabela[linha5][coluna];
                indexColunaMenor = coluna;
            }
        }

        System.out.println("maior da linha 5: " + maiorL5 + " esta na coluna " + indexColunaMaior);
        System.out.println("menor da linha 5: " + menorL5 + " esta na coluna " + indexColunaMenor);

        for (int i = 0; i < tabela[coluna7].length; i++) {
            if (tabela[i][coluna7] > maiorC7) {
                maiorC7 = tabela[i][coluna7];
                indexColunaMaior = i;
            }
            if(tabela[i][coluna7] < menorC7) {
                menorC7 = tabela[i][coluna7];
                indexColunaMenor = indexColunaMenor;
            }
        }

        System.out.println("maior da coluna " + coluna7 + " : " + maiorC7 + " esta na linha: " + indexColunaMaior);
        System.out.println("menor da coluna " + coluna7 + " : " + menorC7 + " esta na linha: " + indexColunaMenor);

    }
}
