
package chapter2;

/**
 *
 * @author USER
 */
public class Array1DimensiOperasi {
    
    // Mencari nilai maksimum - O(n)
    public static int findMax(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array kosong");
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // Mencari nilai minimum - O(n)
    public static int findMin(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array kosong");
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array kosong");
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index
            }
            
        }
        return -1; // Not found
    }
    
    // Reverse array - O(n)
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
         int[] scores = {85, 92, 78, 90, 88};
         System.out.println("Nilai maksimum: " + findMax(scores));
         System.out.println("Nilai Rata: " + calculateAverage(scores));
         
    }
}
