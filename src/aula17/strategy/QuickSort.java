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
public class QuickSort implements Ordenacao{
    
    @Override
    public int[] ordenar(int[] arr) {
        
        int n = arr.length;
        
        sort(arr, 0, n-1); 
  
        System.out.println("Array ordenando usuando Quick Sort");
        return arr;
    }
    
    int particao(int arr[], int menor, int maior) { 
        
        int pivot = arr[maior];  
        int i = (menor-1);  
        for (int j=menor; j<maior; j++) { 
           
            if (arr[j] <= pivot) { 
                i++;
                
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
        
        int temp = arr[i+1]; 
        arr[i+1] = arr[maior]; 
        arr[maior] = temp; 
  
        return i+1; 
    } 
  
  

    void sort(int arr[], int menor, int maior) { 
        if (menor < maior) { 
           
            int pi = particao(arr, menor, maior);
            
            sort(arr, menor, pi-1); 
            sort(arr, pi+1, maior); 
        } 
    }  
} 