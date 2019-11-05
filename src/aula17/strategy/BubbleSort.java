/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17.strategy;

/**
 *
 * @author felip
 */
public class BubbleSort implements Ordenacao{
    
    @Override
    public int[] ordenar(int[] arr) {
        bubbleSort(arr);
        System.out.println("Array ordenando usuando Bubble Sort");
        return arr;
    }
    
    void bubbleSort(int arr[]) {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
