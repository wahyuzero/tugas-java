import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PenghasilanKaryawanArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Locale indonesia = Locale.forLanguageTag("id-ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);


        double[] daftarGaji = {5000000.0, 6500000.0, 9500000.0};
        double[] arrayLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        System.out.println("PROGRAM PERHITUNGAN PENGHASILAN KARYAWAN & LEMBUR");
        System.out.println("BERBASIS OPERATOR, STATEMEN IF, & ARRAY");
        System.out.println("TUGAS 3 PRAKTIK STSI4102 ALGORITMA & PEMROGRAMAN");

        System.out.print("Golongan Karyawan (A / B / C) : ");
        if (!input.hasNext()) {
            System.out.println("[Error] golongan karyawan tidak boleh kosong.");
            input.close();
            return;
        }
        String golongan = input.next().trim();


        int indeksGaji = -1;
        if (golongan.equalsIgnoreCase("A")) {
            indeksGaji = 0; // ambil Gaji Array 0
        } else if (golongan.equalsIgnoreCase("B")) {
            indeksGaji = 1; // ambil Gaji Array 1
        } else if (golongan.equalsIgnoreCase("C")) {
            indeksGaji = 2; // gambil Gaji Array 2
        } else {

            System.out.println("\n[Error] Golongan '" + golongan + "' tidak valid!");
            System.out.println("Pilih golongan karyawan hanya A, B, atau C.");
            input.close();
            return;
        }

        double gajiPokok = daftarGaji[indeksGaji];


        System.out.print("Masukkan Jumlah Jam Lembur (jam)       : ");
        if (!input.hasNextInt()) {
            System.out.println("\n[Galat] Masukan jam lembur harus berupa bilangan bulat!");
            input.close();
            return;
        }
        int jamLembur = input.nextInt();


        double persenLembur = 0.0;
        int indeksLembur = -1;


        if (jamLembur < 0) {
            System.out.println("\n[Galat] Jumlah jam lembur tidak boleh bernilai negatif (" + jamLembur + ").");
            input.close();
            return;
        } 

        else if (jamLembur == 0) {
            persenLembur = 0.00; // 0% upah lembur
        } 

        else if (jamLembur == 1) {
            indeksLembur = 0;
            persenLembur = arrayLembur[indeksLembur];
        } else if (jamLembur == 2) {
            indeksLembur = 1;
            persenLembur = arrayLembur[indeksLembur];
        } else if (jamLembur == 3) {
            indeksLembur = 2;
            persenLembur = arrayLembur[indeksLembur];
        } else if (jamLembur == 4) {
            indeksLembur = 3;
            persenLembur = arrayLembur[indeksLembur];
        } 

        else {
            indeksLembur = 4;
            persenLembur = arrayLembur[indeksLembur];
        }


        double gajiLembur = persenLembur * gajiPokok;

        double totalPenghasilan = gajiPokok + gajiLembur;



        System.out.println("               SLIP RINCIAN PENGHASILAN KARYAWAN            ");
        System.out.printf("Golongan  : Golongan %s (Array Gaji Indeks [%d])\n", golongan.toUpperCase(), indeksGaji);
        System.out.printf("Gaji Pokok        : %s\n", formatRupiah.format(gajiPokok));
        if (jamLembur == 0) {
            System.out.printf("Jumlah Lembur     : %d Jam (Tanpa Upah Lembur)\n", jamLembur);
        } else {
            System.out.printf("Jumlah Lembur     : %d Jam (Array Lembur Indeks [%d] = %.0f%%)\n", 
                              jamLembur, indeksLembur, persenLembur * 100);
        }
        System.out.printf("Gaji Lembur       : %s\n", formatRupiah.format(gajiLembur));
        System.out.printf("TOTAL PENGHASILAN : %s\n", formatRupiah.format(totalPenghasilan));

        input.close();
    }
}
