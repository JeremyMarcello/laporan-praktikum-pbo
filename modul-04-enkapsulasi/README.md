# Modul 4 - Enkapsulasi

Nama: **Jeremy Marcello Waani**  
NIM: **2311110003**

Guided 1, Guided 2, dan Unguided dikerjakan dalam proyek Maven yang sudah ada:
[`project/modul-04-enkapsulasi`](project/modul-04-enkapsulasi).

## Laporan praktikum

Laporan mengikuti sampul dan susunan laporan modul 2 dan 3: **A. Dasar Teori**,
**B. Guided**, **C. Unguided**, dan **D. Kesimpulan**. Kode dan output di Word
berupa teks yang dapat diedit. Bagian Guided hanya memuat judul, kode, dan output;
penjelasan terdapat pada Dasar Teori, Unguided, dan Kesimpulan.

- [Laporan Word (.docx)](docs/Modul04_2311110003_Jeremy%20Marcello%20Waani.docx)
- [Laporan PDF revisi](docs/Modul04_2311110003_Jeremy%20Marcello%20Waani_Revisi.pdf)

## Susunan kode

```text
project/modul-04-enkapsulasi/
├── pom.xml
└── src/main/java/
    ├── com/marcel/mavenproject1/Mavenproject1.java
    ├── guided1/
    │   ├── manusia/Manusia.java
    │   └── main/DemoManusia.java
    ├── guided2/
    │   ├── hargatoken/HargaToken.java
    │   ├── hargapulsa/HargaPulsa.java
    │   └── main/Main.java
    ├── model/Dataset.java
    ├── laporan/LaporanDataset.java
    └── main/Main.java
```

Package `guided1` dan `guided2` membedakan kedua latihan, termasuk class `Main`.
Unguided menggunakan package `model`, `laporan`, dan `main` persis seperti struktur
yang diminta pada soal. Penamaan class menggunakan huruf awal kapital dan package
menggunakan huruf kecil.

## Menjalankan di Apache NetBeans

1. Pilih **File > Open Project**, lalu buka folder `project/modul-04-enkapsulasi`.
2. Gunakan JDK **26 atau lebih baru**, sesuai `maven.compiler.release` pada `pom.xml`.
3. **Run Project (F6)** menjalankan Guided 1, Guided 2, kemudian Unguided melalui
   class utama proyek yang sudah ada, `com.marcel.mavenproject1.Mavenproject1`.
4. Untuk menjalankan satu latihan, buka file berikut lalu pilih **Run File (Shift+F6)**.

| Latihan | File yang dijalankan | Nama lengkap class |
|---|---|---|
| Guided 1 | [`DemoManusia.java`](project/modul-04-enkapsulasi/src/main/java/guided1/main/DemoManusia.java) | `guided1.main.DemoManusia` |
| Guided 2 | [`Main.java`](project/modul-04-enkapsulasi/src/main/java/guided2/main/Main.java) | `guided2.main.Main` |
| Unguided | [`Main.java`](project/modul-04-enkapsulasi/src/main/java/main/Main.java) | `main.Main` |

## Menjalankan dari terminal

Jalankan perintah berikut dari folder `project/modul-04-enkapsulasi`.
Maven harus tersedia di `PATH`, sedangkan `JAVA_HOME` dan perintah `java` harus
mengarah ke JDK 26 atau lebih baru.

```console
mvn verify
java -cp target/classes guided1.main.DemoManusia
java -cp target/classes guided2.main.Main
java -cp target/classes main.Main
```

Untuk menjalankan semua latihan sekaligus:

```console
java -cp target/classes com.marcel.mavenproject1.Mavenproject1
```

## Catatan soal unguided

Soal secara eksplisit meminta setter `jumlahBaris`, `jumlahKolom`, dan
`jumlahMissing` **tidak mengubah nilai**. Ketentuan itu diterapkan. Akibatnya,
pemanggilan setter angka untuk Titanic tetap menghasilkan nilai `0`, persentase
`0.00%`, dan status `Bersih`, berbeda dengan contoh laporan pada soal.

Lihat [analisis lengkap](docs/Analisis_Modul_4.md),
[soal unguided](docs/Soal_Unguided_Modul_4.md), serta hasil eksekusi aktual:

- [Guided 1](docs/hasil-eksekusi/guided1.txt)
- [Guided 2](docs/hasil-eksekusi/guided2.txt)
- [Unguided](docs/hasil-eksekusi/unguided.txt)
- [Semua latihan](docs/hasil-eksekusi/semua-latihan.txt)
