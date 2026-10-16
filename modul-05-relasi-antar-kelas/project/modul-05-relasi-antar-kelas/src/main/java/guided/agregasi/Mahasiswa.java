package guided.agregasi;

public class Mahasiswa {
    private String NIM;
    private String Nama;
    
    public Mahasiswa (String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
    }

    public String getNim(){
        return (NIM) ;
    }

    public String getNama(){
        return (Nama) ;
    }

    public void setNim(String NIM){
        this.NIM = NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

}
