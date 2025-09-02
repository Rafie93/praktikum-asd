package chapter2;


public class ArrayObject3Dimensi {
    public static void main(String[] args) {
        // Array 2x2x2 berisi objek Buku
        Buku[][][] perpustakaan = new Buku[2][2][2];

        // Isi array dengan objek Buku
        perpustakaan[0][0][0] = new Buku("Algoritma", "Andi");
        perpustakaan[0][0][1] = new Buku("Struktur Data", "Budi");
        perpustakaan[0][1][0] = new Buku("Java Dasar", "Citra");
        perpustakaan[0][1][1] = new Buku("Pemrograman Lanjut", "Dedi");

        perpustakaan[1][0][0] = new Buku("Basis Data", "Eka");
        perpustakaan[1][0][1] = new Buku("Jaringan Komputer", "Fajar");
        perpustakaan[1][1][0] = new Buku("Kecerdasan Buatan", "Gilang");
        perpustakaan[1][1][1] = new Buku("Machine Learning", "Hani");

        // Cetak isi array 3D
        for (int i = 0; i < perpustakaan.length; i++) {          // lantai
            for (int j = 0; j < perpustakaan[i].length; j++) {   // rak/baris
                for (int k = 0; k < perpustakaan[i][j].length; k++) { // kolom
                    System.out.print("[L" + i + "][R" + j + "][K" + k + "] ");
                    perpustakaan[i][j][k].tampil();
                }
            }
        }
    }
}
