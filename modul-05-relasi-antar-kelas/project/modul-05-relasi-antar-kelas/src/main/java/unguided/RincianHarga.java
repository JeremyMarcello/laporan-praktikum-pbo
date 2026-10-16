package unguided;

public class RincianHarga {
    private final double hargaDasar;
    private final double pajak;

    public RincianHarga(double hargaDasar) {
        if (!Double.isFinite(hargaDasar) || hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar harus berupa angka yang tidak negatif.");
        }

        this.hargaDasar = hargaDasar;
        this.pajak = this.hargaDasar * 0.10;
    }

    public double getHargaDasar() {
        return this.hargaDasar;
    }

    public double getPajak() {
        return this.pajak;
    }

    public double getHargaTotal() {
        return this.hargaDasar + this.pajak;
    }
}
