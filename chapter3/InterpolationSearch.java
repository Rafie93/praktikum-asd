package chapter3;

/**
 *
 * @author USER
 */
public class InterpolationSearch {
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high && key >= arr[low] && key <= arr[high]) {
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            
            if (arr[pos] == key) return pos;
            if (arr[pos] < key) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 70;
        int index = search(data, key);
        System.out.println(index == -1 ? "Data tidak ditemukan" : "Data ditemukan di index " + index);
    }
}
