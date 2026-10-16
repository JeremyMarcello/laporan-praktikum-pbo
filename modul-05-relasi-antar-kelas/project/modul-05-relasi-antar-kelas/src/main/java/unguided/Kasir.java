package unguided;

public class Kasir {
    private final String namaKasir;

    public Kasir(String namaKasir) {
        if (namaKasir == null || namaKasir.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama kasir tidak boleh kosong.");
        }

        this.namaKasir = namaKasir;
    }

    // Asosiasi: Pesanan hanya digunakan melalui parameter, bukan sebagai field.
    public void prosesPembayaran(Pesanan pesanan) {
        if (pesanan == null) {
            throw new IllegalArgumentException("Pesanan tidak boleh null.");
        }

        double totalSubtotal = 0;
        double totalPajak = 0;
        double totalBayar = 0;
        ItemPesanan[] daftarItem = pesanan.getDaftarItem();

        for (int i = 0; i < pesanan.getJumlahItem(); i++) {
            RincianHarga rincian = daftarItem[i].getRincian();
            totalSubtotal += rincian.getHargaDasar();
            totalPajak += rincian.getPajak();
            totalBayar += rincian.getHargaTotal();
        }

        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("==============================");
    }
}
