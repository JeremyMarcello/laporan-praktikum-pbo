package guided1.main;

import guided1.manusia.Manusia;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia[] arrMns = new Manusia[3];

        // Constructor tanpa parameter, kemudian atribut diisi melalui setter.
        Manusia objMns1 = new Manusia();
        objMns1.setNama("Markonah");
        objMns1.setUmur(76);

        // Umur tetap bernilai default 0 karena hanya nama yang diisi.
        Manusia objMns2 = new Manusia("Mat Conan");

        // Constructor dengan dua parameter langsung mengisi nama dan umur.
        Manusia objMns3 = new Manusia("Bajuri", 13);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i = 0; i < arrMns.length; i++) {
            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur : " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}
