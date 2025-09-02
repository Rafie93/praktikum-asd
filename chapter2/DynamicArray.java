package chapter2;

import java.util.ArrayList;
import java.util.Collections;


public class DynamicArray {
     public static void main(String[] args) {
        // Membuat ArrayList
         ArrayList<Integer> dynamicArray = new ArrayList<>();
        // Menambah elemen
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(5);
        dynamicArray.add(8);
        dynamicArray.set(2, 25);        
        //menghapus elemen
        dynamicArray.remove(3);
        // Mengakses elemen
        System.out.println("Elemen ke-2: " + dynamicArray.get(1)); 
        // Sorting
         Collections.sort(dynamicArray);
        for (int num : dynamicArray) {
           System.out.print(num + " ");
        }
        
//        // Sorting
//        Collections.sort(dynamicArray);
//        
//        // Pencarian biner (harus terurut dulu)
//        int index = Collections.binarySearch(dynamicArray, 25);
//        
//        // Menampilkan semua elemen
//        for (int num : dynamicArray) {
//            System.out.print(num + " ");
//        }
//        
//        // Konversi ke array biasa
//        Integer[] normalArray = dynamicArray.toArray(new Integer[0]);
    }
}
