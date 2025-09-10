
package chapter3;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index
            }
        }
        return -1; // tidak ditemukan
    }

    public static void main(String[] args) {
        int[] data = {23, 45, 12, 67, 34, 89};
        int key = 12;

        int result = linearSearch(data, key);
        if (result == -1)
            System.out.println("Data tidak ditemukan");
        else
            System.out.println("Data ditemukan pada index ke-" + result);
    }
}

