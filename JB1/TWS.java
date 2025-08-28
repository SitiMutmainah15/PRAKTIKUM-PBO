public class TWS {

    private String warna;
    private String tipeKoneksi;
    private String berat;
    private String merk;
    private int batteryLife;
    private int kapasitasBaterai;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTipeKoneksi(String tipeKoneksi) {
        this.tipeKoneksi = tipeKoneksi;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    void hubungkanPerangkat() {
        System.out.println("Menghubungkan TWS ke perangkat melalui Bluetooth.");
    }

    void kegunaan() {
        System.out.println("Memutar musik menggunakan TWS.");
    }

    void sambungOtomatis() {
        System.out.println("TWS otomatis terhubung ke perangkat terakhir.");
    }

    void cetakInformasi() {
        System.out.println("=== Informasi TWS ===");
        System.out.println("Warna             : " + warna);
        System.out.println("Tipe Koneksi      : " + tipeKoneksi);
        System.out.println("Berat             : " + berat);
        System.out.println("Merk              : " + merk);
        System.out.println("Battery Life      : " + batteryLife + " jam");
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
    }
}
