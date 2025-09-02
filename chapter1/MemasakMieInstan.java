
package chapter1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MemasakMieInstan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== SIMULASI MEMASAK MIE INSTAN ===");
        // Langkah 1: Siapkan bahan
        System.out.println("1. Siapkan: mie, air, panci, kompor");
        // Langkah 2-4: Rebus air
        System.out.print("2. Tuang air ke panci & nyalakan kompor...");
        input.nextLine();  
        // Analogi: Loop while menunggu air mendidih
        boolean airMendidih = false;
        while (!airMendidih) {
            System.out.print("Apakah air sudah mendidih? (y/n): ");
            if (input.nextLine().equalsIgnoreCase("y")) {
                airMendidih = true;
            }
        }
        // Langkah 5-6: Masukkan mie
        System.out.println("5. Masukkan mie ke panci");
        // Langkah 7-8: Masak 3 menit (analogi for loop)
        System.out.println("6. Mulai memasak (3 menit)...");
        for (int menit = 1; menit <= 3; menit++) {
            System.out.println("   - Menit ke-" + menit + ": Aduk mie");
        }
        // Langkah 9: Matikan kompor
        System.out.println("9. Matikan kompor");
        // Langkah 10: Tiriskan/pilih jenis mie
        System.out.print("10. Jenis mie? (1=Kuah, 2=Goreng): ");
        int jenis = input.nextInt();
        if (jenis == 1) {
            System.out.println("   Tuang mie + air ke mangkuk");
        } else {
            System.out.println("   Tiriskan mie, buang air");
        }
        // Langkah 11-12: Tambah bumbu
        System.out.println("11. Tambahkan bumbu, minyak, pelengkap");
        System.out.println("12. Aduk rata");
        // Langkah 13: Sajikan
        System.out.println("13. Mie siap disajikan! 🍜");
        
        input.close();
    }
}