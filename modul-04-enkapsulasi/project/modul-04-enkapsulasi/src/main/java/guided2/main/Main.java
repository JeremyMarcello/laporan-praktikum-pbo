package guided2.main;

import guided2.hargapulsa.HargaPulsa;
import guided2.hargatoken.HargaToken;

public class Main {
    public static void main(String[] args) {
        HargaToken objectToken = new HargaToken();
        objectToken.info();
        System.out.println();

        HargaPulsa objectPulsa = new HargaPulsa();
        objectPulsa.info();
    }
}
