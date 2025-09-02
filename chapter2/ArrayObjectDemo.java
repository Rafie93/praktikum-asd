package chapter2;

public class ArrayObjectDemo {
    public static void main(String[] args) {
        // Membuat array untuk 3 Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[3];

        // Inisialisasi objek-objeknya
        daftar[0] = new Mahasiswa("Andi", 101);
        daftar[1] = new Mahasiswa("Budi", 102);
        daftar[2] = new Mahasiswa("Citra", 103);

        // Menampilkan semua data mahasiswa
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampil();
        }
        
        // Array Object 2D
        Mahasiswa[][] daftar2d = new Mahasiswa[2][2];

        // Isi array dengan objek Buku
        daftar2d[0][0] = new Mahasiswa("Andi", 101);
        daftar2d[0][1] = new Mahasiswa("Budi", 102);
        daftar2d[1][0] = new Mahasiswa("Citra", 103);
        daftar2d[1][1] = new Mahasiswa("Dina", 104);

        // Cetak isi array
        for (int i = 0; i < daftar2d.length; i++) {
            for (int j = 0; j < daftar2d[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] ");
                daftar2d[i][j].tampil();
            }
        }
    }
}
