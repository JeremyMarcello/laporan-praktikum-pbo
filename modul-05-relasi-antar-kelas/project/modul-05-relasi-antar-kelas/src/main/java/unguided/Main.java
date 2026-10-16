package unguided;

public class Main {
    public static void main(String[] args) {
        Kasir kasir = new Kasir("Budi");

        // Item dibuat secara independen sebelum dimasukkan ke dalam pesanan.
        ItemPesanan americano = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan croissant = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan matcha = new ItemPesanan("Matcha Latte", 22000);

        Pesanan pesanan = new Pesanan(4, 5);
        pesanan.tambahItem(americano);
        pesanan.tambahItem(croissant);
        pesanan.tambahItem(matcha);

        pesanan.tampilkanPesanan();
        System.out.println();
        kasir.prosesPembayaran(pesanan);
    }
}
