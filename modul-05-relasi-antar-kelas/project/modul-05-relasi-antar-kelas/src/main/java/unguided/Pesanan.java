package unguided;

public class Pesanan {
    private final int nomorMeja;
    private final ItemPesanan[] daftarItem;
    private int jumlahItem;

    public Pesanan(int nomorMeja, int kapasitas) {
        if (nomorMeja <= 0) {
            throw new IllegalArgumentException("Nomor meja harus lebih dari nol.");
        }
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas pesanan harus lebih dari nol.");
        }

        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    public void tambahItem(ItemPesanan item) {
        if (item == null) {
            throw new IllegalArgumentException("Item pesanan tidak boleh null.");
        }
        if (this.jumlahItem >= this.daftarItem.length) {
            throw new IllegalStateException("Kapasitas pesanan sudah penuh.");
        }

        // Agregasi: simpan referensi item yang sudah dibuat di luar Pesanan.
        this.daftarItem[this.jumlahItem] = item;
        this.jumlahItem++;
    }

    public void tampilkanPesanan() {
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja: " + this.nomorMeja);

        for (int i = 0; i < this.jumlahItem; i++) {
            ItemPesanan item = this.daftarItem[i];
            RincianHarga rincian = item.getRincian();

            System.out.println((i + 1) + ". " + item.getNamaItem()
                    + " - Rp " + rincian.getHargaTotal()
                    + " (Harga: " + rincian.getHargaDasar()
                    + ", Pajak: " + rincian.getPajak() + ")");
        }
    }

    public int getNomorMeja() {
        return this.nomorMeja;
    }

    public ItemPesanan[] getDaftarItem() {
        // Salin array agar pemanggil tidak bisa mengganti isi array internal.
        // Referensi item tetap sama, sesuai hubungan agregasi.
        return this.daftarItem.clone();
    }

    public int getJumlahItem() {
        return this.jumlahItem;
    }
}
