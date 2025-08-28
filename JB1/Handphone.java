public class Handphone {

    private String warna;
    private double layar; 
    private String sistemOperasi;
    private int memori;   
    private String brand;
    private int kamera;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setLayar(double layar) {
        this.layar = layar;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public void setMemori(int memori) {
        this.memori = memori;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public void memutarMusik() {
        System.out.println("Memutar musik menggunakan handphone.");
    }

    public void mengambilFoto() {
        System.out.println("Mengambil foto atau video dengan handphone.");
    }

    public void melakukanPanggilan() {
        System.out.println("Melakukan panggilan telepon menggunakan handphone.");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Handphone ===");
        System.out.println("Warna           : " + warna);
        System.out.println("Layar           : " + layar + " inch");
        System.out.println("Sistem Operasi  : " + sistemOperasi);
        System.out.println("Memori          : " + memori + " GB");
        System.out.println("Brand           : " + brand);
        System.out.println("Jumlah Kamera   : " + kamera);
    }
}
