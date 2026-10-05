package unguided;

import java.util.Arrays;
import java.util.Locale;

public class PengolahSuhu {
    public static final double NILAI_KOSONG = -1.0;
    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°"
                        + "C");
            }
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    public void isiDataKosong() {
        int index = cariIndexKosong();
        // ponytail: imputasi rata-rata tetangga terdekat (1 langkah); upgrade ke interpolasi spline/moving average jika rentang data kosong > 1 hari
        if (index > 0 && index < suhuHarian.length - 1) {
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2.0;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }

    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();

        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("Index hari kosong (dimulai dari 0): " + indexKosong);
        System.out.println();

        pengolah.isiDataKosong();

        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();

        System.out.printf(Locale.US, "Rata-rata : %.2f°C%n%n", pengolah.hitungRataRata());

        /*
         * Penjelasan perubahan array suhuHarian di main:
         * Array di Java merupakan tipe data referensi (reference type). Saat array suhuHarian
         * dikirim ke constructor PengolahSuhu, constructor tersebut menyimpan alamat referensi memori
         * dari array yang sama persis ke instance field this.suhuHarian (shallow copy/bukan duplikat baru).
         * Akibatnya, ketika isiDataKosong() memodifikasi elemen array melalui objek, perubahan tersebut
         * langsung berdampak pada array suhuHarian di main karena keduanya merujuk ke blok memori yang sama.
         */
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");

        // Self-check
        assert suhuHarian[3] == 29.1 : "Imputasi data suhu hari ke-4 gagal";
        assert Math.abs(pengolah.hitungRataRata() - 29.3857) < 0.01 : "Perhitungan rata-rata tidak valid";
    }
}
