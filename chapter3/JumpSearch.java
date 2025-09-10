
package chapter3;

public class JumpSearch {
    public static int search(int[] arr, int key) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        
        while (arr[Math.min(step, n)-1] < key) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) return -1;
        }
        
        while (arr[prev] < key) {
            prev++;
            if (prev == Math.min(step, n)) return -1;
        }
        
        return arr[prev] == key ? prev : -1;
    }
    
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
        int key = 50;
        int index = search(data, key);
        System.out.println(index == -1 ? "Data tidak ditemukan" : "Data ditemukan di index " + index);
 
    }

}
