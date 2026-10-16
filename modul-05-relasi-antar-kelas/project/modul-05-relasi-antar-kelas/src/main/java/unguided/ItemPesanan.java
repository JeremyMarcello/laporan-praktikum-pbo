package unguided;

public class ItemPesanan {
    private final String namaItem;
    private final RincianHarga rincian;

    public ItemPesanan(String namaItem, double hargaDasar) {
        if (namaItem == null || namaItem.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama item tidak boleh kosong.");
        }

        this.namaItem = namaItem;
        // Komposisi: rincian harga dibuat dan dimiliki oleh item pesanan ini.
        this.rincian = new RincianHarga(hargaDasar);
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public RincianHarga getRincian() {
        return this.rincian;
    }
}
