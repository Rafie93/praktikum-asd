package chapter7;



public class Mahasiswa {
    private String nama;
    private double ipk;
    
    public Mahasiswa(String nama, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }
    
    public String getNama() { return nama; }
    public double getIpk() { return ipk; }
    
    @Override
    public String toString() {
        return String.format("Nama: %-6s | IPK: %.2f", nama, ipk);
    }
}
