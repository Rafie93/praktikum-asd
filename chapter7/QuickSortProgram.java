package chapter7;

import java.util.Scanner;

public class QuickSortProgram {
    
    // Counter untuk menampilkan nomor langkah
    private static int stepCounter = 1;
    
    // Metode utama Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Dapatkan index pivot setelah partisi
            int pi = partition(arr, low, high);
            
            // Rekursif sort elemen sebelum dan setelah pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    // Metode partisi yang menampilkan proses detail
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pilih elemen terakhir sebagai pivot
        int i = low - 1; // Index elemen yang lebih kecil
        
        System.out.println("\n=== LANGKAH " + stepCounter++ + " ===");
        System.out.println("Partisi dari index " + low + " sampai " + high);
        System.out.println("Pivot: " + pivot + " (elemen terakhir)");
        System.out.print("Sub-array sebelum partisi: ");
        printSubArrayWithPivot(arr, low, high);
        
        System.out.println("\nProses perbandingan dan penukaran:");
        
        for (int j = low; j < high; j++) {
            System.out.print("  Bandingkan arr[" + j + "]=" + arr[j] + " dengan pivot=" + pivot);
            // Jika elemen saat ini lebih kecil atau sama dengan pivot
            if (arr[j] <= pivot) {
                i++;
                System.out.println(" -> LEBIH KECIL, tukar dengan arr[" + i + "]");
                
                // Tukar arr[i] dan arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                System.out.print("    Setelah penukaran: ");
                printSubArrayWithPivot(arr, low, high);
            } else {
                System.out.println(" -> LEBIH BESAR, lewati");
            }
        }
        
        // Tukar arr[i+1] dan arr[high] (pivot)
        System.out.println("\n  Letakkan pivot pada posisi yang benar:");
        System.out.println("  Tukar arr[" + (i + 1) + "]=" + arr[i + 1] + " dengan arr[" + high + "]=" + arr[high] + " (pivot)");
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        System.out.print("  Hasil akhir partisi: ");
        printSubArrayWithPivot(arr, low, high);
        System.out.println("  Pivot sekarang berada di index: " + (i + 1));
        System.out.println("  Elemen kiri pivot: " + ((i + 1) - low) + " elemen");
        System.out.println("  Elemen kanan pivot: " + (high - (i + 1)) + " elemen");
        
        return i + 1;
    }
    
    public static void printSubArrayWithPivot(int[] arr, int low, int high) {
        System.out.print("Print Proses Sub Array [");
        for (int i = low; i <= high; i++) {
            if (i == high) {
                System.out.print("**" + arr[i] + "**"); 
            } else {
                System.out.print(arr[i]);
            }
            if (i < high) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Metode untuk menampilkan seluruh array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Metode untuk menampilkan array dengan highlight area yang sedang diproses
    public static void printArrayWithHighlight(int[] arr, int low, int high) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == low) {
                System.out.print("| "); // Mulai area partisi
            }
            
            System.out.print(arr[i]);
            
            if (i == high) {
                System.out.print(" |"); // Akhir area partisi
            }
            
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Metode untuk input data dari pengguna
    public static int[] inputData() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("=== PROGRAM QUICK SORT DINAMIS ===");
        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Masukkan " + n + " elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data
        int[] arr = inputData();
        int[] originalArr = arr.clone();
        
        // Reset counter
        stepCounter = 1;
        
        // Tampilkan data sebelum sorting
        System.out.println("\n=== DATA AWAL ===");
        System.out.print("Data sebelum diurutkan: ");
        printArray(originalArr);
        
        // Proses Quick Sort
        System.out.println("\n=== MULAI PROSES QUICK SORT ===");
        quickSort(arr, 0, arr.length - 1);
        
        // Tampilkan data setelah sorting
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.print("Data setelah diurutkan: ");
        printArray(arr);
        
        scanner.close();
    }
}