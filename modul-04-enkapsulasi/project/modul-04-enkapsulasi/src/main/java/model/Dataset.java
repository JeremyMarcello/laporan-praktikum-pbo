package model;

public class Dataset {
    public static final double BATAS_MISSING = 5.0;
    private static int totalDataset = 0;

    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    public Dataset() {
        totalDataset++;
    }

    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++;
    }

    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        totalDataset++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        // Sesuai ketentuan soal, setter ini tidak mengubah nilai atribut.
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        // Sesuai ketentuan soal, setter ini tidak mengubah nilai atribut.
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        // Sesuai ketentuan soal, setter ini tidak mengubah nilai atribut.
    }

    public double getPersentaseMissing() {
        // Gunakan long sebelum perkalian agar total sel tidak melampaui batas int.
        long totalSel = (long) jumlahBaris * jumlahKolom;
        if (totalSel == 0) {
            return 0.0;
        }
        return jumlahMissing * 100.0 / totalSel;
    }

    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    public static int getTotalDataset() {
        return totalDataset;
    }
}
