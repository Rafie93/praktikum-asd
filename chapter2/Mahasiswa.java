package chapter2;

public class Mahasiswa {
    String nama;
    int nim;

    Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
}
