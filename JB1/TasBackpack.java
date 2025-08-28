public class TasBackpack extends Tas {
    private boolean waterproof;
    private int jumlahKantongSamping;

    public void setWaterproof(boolean newValue) {
        waterproof = newValue;
    }

    public void setJumlahKantongSamping(int newValue) {
        jumlahKantongSamping = newValue;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Waterproof              : " + (waterproof ? "Ya" : "Tidak"));
        System.out.println("Jumlah Kantong Samping  : " + jumlahKantongSamping);
    }
}
