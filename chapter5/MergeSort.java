package chapter5;

import java.util.Arrays;

public class MergeSort {
    
    public static void main(String[] args) {
        int[] arr = {98, 23, 45, 14, 6, 67, 33, 42};
        System.out.println("Array sebelum sorting: " + Arrays.toString(arr));
        System.out.println("\n=== PROSES MERGE SORT ===");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nArray setelah sorting: " + Arrays.toString(arr));
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            System.out.println("Bagi: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)) + 
                             " → Left: " + Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) + 
                             ", Right: " + Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));
            
            // Rekursi untuk bagian kiri dan kanan
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Gabungkan bagian yang sudah terurut
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        // Buat array temporary
        int[] temp = new int[right - left + 1];
        
        int i = left;      // Pointer untuk left subarray
        int j = mid + 1;   // Pointer untuk right subarray
        int k = 0;         // Pointer untuk temp array
        // Bandingkan dan gabungkan
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // Salin sisa elemen dari left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // Salin sisa elemen dari right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // Salin kembali ke array original
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
        
        System.out.println("Merge: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
    }
}