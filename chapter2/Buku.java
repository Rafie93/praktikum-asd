package chapter2;


public class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampil() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}
