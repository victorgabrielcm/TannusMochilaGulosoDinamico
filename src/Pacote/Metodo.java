package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Metodo {

    int maxWeight;
    int tamanho = 0;
    float vt = 0;
    List<Retorno> metodo = new ArrayList<>();
    int i;
    int j;

    public Metodo(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void completaMetodoGuloso(List<Retorno> retornos) {
        float metodoMaxWeight = this.maxWeight;

        for (Retorno retorno : retornos) {
            if (retorno.p <= metodoMaxWeight) {
                metodo.add(retorno);
                metodoMaxWeight -= retorno.p;
                System.out.println(retorno);
                this.tamanho++;
                this.vt += retorno.v;
            }
        }
        System.out.println("Metodo Guloso Não Ordenado");
        
        System.out.println("Conteudo da Mochila: " + this.tamanho);
        
        System.out.println("Valor Dos Itens Na Mochila " + this.vt);
    }

    public void completaMetodoDinamico(List<Retorno> retornos) {
        int[][] matriz = new int[retornos.size()][this.maxWeight + 1];
        i = retornos.size()-1;
        j=this.maxWeight;
        for (int linha = 0; linha < retornos.size(); linha++) {
            for (int coluna = 0; coluna <= this.maxWeight; coluna++) {
                if (linha == 0 || coluna == 0)
                    matriz[linha][coluna] = 0;
                else if (retornos.get(linha - 1).p <= coluna)
                    matriz[linha][coluna] = max(retornos.get(linha - 1).v + matriz[linha - 1][coluna - retornos.get(linha - 1).p], matriz[linha - 1][coluna]);
                else
                    matriz[linha][coluna] = matriz[linha - 1][coluna];

            }
        }
        for (int linha = 0; linha < retornos.size(); linha++) {
            for (int coluna = 0; coluna <= this.maxWeight; coluna++) {
                System.out.print(matriz[linha][coluna] + "-");
            }
            System.out.println("-");
        }

        this.metodo = new ArrayList<>();

        while(i > 0 && j > 0) {

            if(matriz[i][j] != matriz[i - 1][j]) {
                this.metodo.add(retornos.get(i-1));
                j = j - retornos.get(i-1).p;
            } else {
            }

            i--;
        }
        System.out.println("Retornos Pelo Metodo Dinamico: ");
        for (Retorno retorno: metodo) {
            System.out.println(retorno);
        }
    }

    static int max(int a, int b) {
        return (a > b ? a : b);
    }

}