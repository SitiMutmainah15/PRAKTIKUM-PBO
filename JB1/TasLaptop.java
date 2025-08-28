public class TasLaptop extends Tas {

    private double ukuranLaptopMaks;  
    private int jumlahResleting;    

    public void setUkuranLaptopMaks(double ukuran) {
        ukuranLaptopMaks = ukuran;
    }

    public void setJumlahResleting(int jumlah) {
        jumlahResleting = jumlah;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Ukuran Laptop Maks      : " + ukuranLaptopMaks + " inci");
        System.out.println("Jumlah Resleting        : " + jumlahResleting);
    }
}
