
package chapter4;

public class InsertionSorting {
    public static void insertionSortWithSteps(int[] arr) {
        System.out.println("=== PROSES INSERTION SORT ===");
        System.out.println("Array awal: " + arrayToString(arr));
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("Iterasi " + i + ":");
            System.out.println("  Key = " + key + " (indeks " + i + ")");
            System.out.println("  Bandingkan dengan elemen kiri...");
            
            // Proses pergeseran elemen
            while (j >= 0 && arr[j] > key) {
                System.out.println("    " + arr[j] + " > " + key + " → geser " + arr[j] + " ke kanan");
                arr[j + 1] = arr[j];
                j--;
                
                if (j >= 0) {
                    System.out.println("    Array sekarang: " + arrayToString(arr));
                }
            }
            // Menempatkan key di posisi yang tepat
            arr[j + 1] = key;
            System.out.println("  Tempatkan key " + key + " di posisi " + (j + 1));
            System.out.println("  Hasil iterasi " + i + ": " + arrayToString(arr));
            System.out.println();
        }
        
        System.out.println("=== SORTING SELESAI ===");
        System.out.println("Array terurut: " + arrayToString(arr));
    }
    
    // Helper method untuk mengonversi array ke string
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        int[] arr = {3,10,4,6,8,9,7,2,1,5};
        
        System.out.println("=== INSERTION SORT DENGAN LANGKAH-LANGKAH ===");
        insertionSortWithSteps(arr);
    }
}