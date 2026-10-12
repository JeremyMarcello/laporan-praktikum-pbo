package main;

import laporan.LaporanDataset;
import model.Dataset;

public class Main {
    public static void main(String[] args) {
        Dataset titanic = new Dataset();
        titanic.setNama("Titanic");
        // Tetap panggil setter sesuai soal; setter angka sengaja tidak mengubah nilai.
        // Karena itu, angka Titanic tetap 0. Analisisnya ada pada dokumentasi modul.
        titanic.setJumlahBaris(891);
        titanic.setJumlahKolom(12);
        titanic.setJumlahMissing(866);

        Dataset wineQuality = new Dataset("Wine Quality");
        Dataset iris = new Dataset("Iris", 150, 5, 0);

        Dataset[] datasets = {titanic, wineQuality, iris};
        LaporanDataset laporan = new LaporanDataset();

        for (Dataset dataset : datasets) {
            laporan.cetak(dataset);
            System.out.println();
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
