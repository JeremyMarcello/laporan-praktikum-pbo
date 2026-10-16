package guided.komposisi;

public class Processor {
    private String brand;
    private int Kecepatan;
    
    public Processor(String brand, int kecepatan){
        this.brand = brand;
        this.Kecepatan = kecepatan;
    }

    //behavior
    public void displaySpec(){
        System.out.println(this.brand + " " + this.Kecepatan);

    }
}
