/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17.strategy;

/**
 *
 * @author a1591363
 */
public class Ordenador {
    
    public int[] ordenar(int[] arr, Ordenacao ordenacao){
        return ordenacao.ordenar(arr);
    }
    
   public void imprimirArray(int[] arr){
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " - ");
       }
       System.out.println("\n");
   }
    
}
