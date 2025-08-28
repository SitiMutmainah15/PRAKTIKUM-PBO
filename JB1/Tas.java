public class Tas {

    private String warna;
    private double kapasitas;
    private String kompartemen;
    private String brand;

    public void setWarna(String warnaBaru) {
        warna = warnaBaru;
    }

    public void setKapasitas(double kapasitasBaru) {
        kapasitas = kapasitasBaru;
    }

    public void setKompartemen(String kompartemenBaru) {
        kompartemen = kompartemenBaru;
    }

    public void setBrand(String brandBaru) {
        brand = brandBaru;
    }

    public void bawaTas(String cara) {
        System.out.println("Tas dibawa dengan cara " + cara + ".");
    }

    public void kegunaan(String aktivitas) {
        System.out.println("Tas digunakan untuk " + aktivitas + ".");
    }
   
    public void cetakInformasi() {
        System.out.println("=== Informasi Tas ===");
        System.out.println("Warna                   : " + warna);
        System.out.println("Kapasitas               : " + kapasitas + " liter");
        System.out.println("Kompartemen             : " + kompartemen);
        System.out.println("Brand                   : " + brand);
    }
}
