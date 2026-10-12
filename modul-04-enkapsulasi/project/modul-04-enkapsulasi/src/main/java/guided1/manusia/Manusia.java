package guided1.manusia;

public class Manusia {
    private String nama;
    private int umur;

    public Manusia() {
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
}
