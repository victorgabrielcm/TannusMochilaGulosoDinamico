package Pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
        int operação;
        
        List<Retorno> retornos = new ArrayList<>();
        Scanner buscar = new Scanner(System.in);
        boolean constante = true;

        while(constante) {

            retornos.add(new Retorno(2, 05));
            retornos.add(new Retorno(4, 10));
            retornos.add(new Retorno(6, 25));
            retornos.add(new Retorno(8, 45));
            retornos.add(new Retorno(10,12));
            retornos.add(new Retorno(12,13));
            retornos.add(new Retorno(14,23));
            retornos.add(new Retorno(16,33));
            retornos.add(new Retorno(18,39));
            retornos.add(new Retorno(20,16));
            retornos.add(new Retorno(22,11));
            retornos.add(new Retorno(24,17));

            Metodo metodo = new Metodo(30);
            

            System.out.println("********** 00 -- Algoritmo Guloso -- **********");
            System.out.println("********** 01 -- Algoritmo Dinamico -- ********");
            
            try{
            	operação = buscar.nextInt();
            }catch (Exception e){
                break;
            }

            if (operação == 00) {
            	
                metodo.completaMetodoGuloso(retornos);
            } else if (operação == 01) {
            	
                metodo.completaMetodoDinamico(retornos);
            } else {
            	
            	constante = false;
            }
        }



    }
}
