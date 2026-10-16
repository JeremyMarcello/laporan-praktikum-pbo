package guided.agregasi;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("001", "Max");
        Mahasiswa m2 = new Mahasiswa("002", "Min");

        Jurusan prodi = new Jurusan("DS", "Data Science");
        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);
        prodi.displayMahasiswa();
    }
}
