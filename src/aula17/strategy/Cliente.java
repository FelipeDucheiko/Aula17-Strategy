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
public class Cliente {
    
    public static void main(String[] args){
        
        int[] arr = {20, 39, 43, 0, 22, 56, 1, 8, 9};
        Ordenador ordenador = new Ordenador();
        System.out.println("Array entrada:");
        ordenador.imprimirArray(arr);
        
        int[] arrOrdenado = ordenador.ordenar(arr, new QuickSort());
        ordenador.imprimirArray(arrOrdenado);
        
        arrOrdenado = null;
        arrOrdenado = ordenador.ordenar(arr, new MergeSort());
        ordenador.imprimirArray(arrOrdenado);
        
        arrOrdenado = null;
        arrOrdenado = ordenador.ordenar(arr, new BubbleSort());
        ordenador.imprimirArray(arrOrdenado);
    }
    
    
    
}
