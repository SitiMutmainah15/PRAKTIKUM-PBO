public class demo {
public static void main(String[] args) {

    TasBackpack tas1 = new TasBackpack();
    TasLaptop tas2 = new TasLaptop();
    TWS tws = new TWS();
    Handphone hp = new Handphone();

        tas1.setWarna("Biru");
        tas1.setKapasitas(1.5);
        tas1.setKompartemen("1 ruang utama, 1 ruang depan");
        tas1.setBrand("Converse");
        tas1.setWaterproof(false);
        tas1.setJumlahKantongSamping(1);
        tas1.cetakInformasi();
        tas1.kegunaan("membawa buku, kotak pensil");
        tas1.bawaTas("dijinjing dengan tangan");

        tas2.setWarna("Hitam");
        tas2.setKapasitas(4);
        tas2.setKompartemen("1 ruang utama, 1 slot laptop, 2 kantong depan, 1 ruang belakang");
        tas2.setUkuranLaptopMaks(15.6);
        tas2.setJumlahResleting(3);
        tas2.cetakInformasi();
        tas2.kegunaan("membawa laptop");
        tas2.bawaTas("dengan bahu");
    
        tws.setWarna("Putih");
        tws.setTipeKoneksi("Bluetooth 5.0");
        tws.setBerat("Ringan");
        tws.setMerk("JBL");
        tws.setBatteryLife(8);
        tws.setKapasitasBaterai(400);
        tws.cetakInformasi();
        tws.hubungkanPerangkat();
        tws.kegunaan();
        tws.sambungOtomatis();

        hp.setWarna("Hitam");
        hp.setLayar(6.5);
        hp.setSistemOperasi("Android");
        hp.setMemori(128);
        hp.setBrand("Realme");
        hp.setKamera(64);
        hp.cetakInformasi();
        hp.memutarMusik();
        hp.mengambilFoto();
}
}
