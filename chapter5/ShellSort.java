package chapter5;
import java.util.Arrays;

public class ShellSort {
    
    public static void main(String[] args) {
        int[] arr = {30, 62, 53, 42, 17, 97, 91, 38};
        int[] gaps = {5, 3, 1};
        System.out.println("Array sebelum sorting: " + Arrays.toString(arr));
        System.out.println("Gap sequence: " + Arrays.toString(gaps));
        System.out.println("\n=== PROSES SHELL SORT ===");
        shellSort(arr, gaps);
        System.out.println("\nArray setelah sorting: " + Arrays.toString(arr));
    }
    
    public static void shellSort(int[] arr, int[] gaps) {
        int n = arr.length;
        for (int gap : gaps) {
            System.out.println("\n--- Gap " + gap + " ---");
            System.out.println("Array sebelum: " + Arrays.toString(arr));
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i; 
                System.out.println("  Elemen " + temp + " di index " + i);
                // Geser elemen yang lebih besar
                while (j >= gap && arr[j - gap] > temp) {
                    System.out.println("    " + arr[j - gap] + " > " + temp + " → geser " + arr[j - gap] + " ke index " + j);
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                // Tempatkan elemen pada posisi yang benar
                if (j != i) {
                    System.out.println("    Tempatkan " + temp + " di index " + j);
                    arr[j] = temp;
                } else {
                    System.out.println("    " + temp + " sudah di posisi benar");
                }
                System.out.println("    Array sementara: " + Arrays.toString(arr));
            }
            System.out.println("Array setelah gap " + gap + ": " + Arrays.toString(arr));
        }
    }
}