package unguided;

public class ModelKlasifikasiDeepLearning extends ModelKlasifikasi {
    private int jumlahLayer;

    public ModelKlasifikasiDeepLearning(String namaModel, int jumlahDataLatih,
            int jumlahKelas, int jumlahLayer) {
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    @Override
    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}
