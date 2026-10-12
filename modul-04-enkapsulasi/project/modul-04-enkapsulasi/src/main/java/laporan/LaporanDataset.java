package laporan;

import java.util.Locale;
import model.Dataset;

public class LaporanDataset {
    public void cetak(Dataset dataset) {
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + dataset.getNama());
        System.out.println("Jumlah Baris : " + dataset.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + dataset.getJumlahKolom());
        System.out.printf(Locale.US, "Missing      : %d sel (%.2f%%)%n",
                dataset.getJumlahMissing(), dataset.getPersentaseMissing());
        System.out.println("Status       : "
                + (dataset.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih"));
    }
}
