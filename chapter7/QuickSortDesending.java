package chapter7;

import java.util.ArrayList;
import java.util.List;

public class QuickSortDesending {
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Andi", 3.75));
        mahasiswaList.add(new Mahasiswa("Budi", 3.20));
        mahasiswaList.add(new Mahasiswa("Citra", 3.90));
        mahasiswaList.add(new Mahasiswa("Dedi", 3.45));
        mahasiswaList.add(new Mahasiswa("Eka", 3.85));
        
        System.out.println("=== SEBELUM SORTING ===");
        mahasiswaList.forEach(System.out::println);
        
        // Sorting
        quickSortHoareDesc(mahasiswaList, 0, mahasiswaList.size() - 1);
        
        System.out.println("\n=== SETELAH SORTING (DESCENDING BERDASARKAN IPK) ===");
        System.out.println("Peringkat:");
        for (int i = 0; i < mahasiswaList.size(); i++) {
            System.out.println((i + 1) + ". " + mahasiswaList.get(i));
        }
    }
    
     public static void quickSortHoareDesc(List<Mahasiswa> list, int low, int high) {
        if (low < high) {
            int pivotIndex = hoarePartition(list, low, high);
            quickSortHoareDesc(list, low, pivotIndex);
            quickSortHoareDesc(list, pivotIndex + 1, high);
        }
    }
    
    private static int hoarePartition(List<Mahasiswa> list, int low, int high) {
        double pivot = list.get(low).getIpk();
        int i = low - 1;
        int j = high + 1;
        
        while (true) {
            do {
                i++;
            } while (i <= high && list.get(i).getIpk() > pivot);
            
            do {
                j--;
            } while (j >= low && list.get(j).getIpk() < pivot);
            
            if (i >= j) return j;
            // Swap
            Mahasiswa temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
