import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class PenghasilanKaryawan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Locale indonesia = Locale.forLanguageTag("id-ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("PROGRAM HITUNG LEMBUR KARYAWAN");
        System.out.println("TUGAS 2 PRAKTIK STSI4102 ALGORITMA & PEMROGRAMAN");


        System.out.print("Masukkan Golongan Karyawan (A / B / C) : ");
        if (!input.hasNext()) {
            System.out.println("[Galat] Masukan golongan karyawan tidak boleh kosong.");
            input.close();
            return;
        }
        String golongan = input.next().trim();


        double gajiPokok = 0.0;
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 5000000.0; // Golongan A: Rp 5.000.000
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 6500000.0; // Golongan B: Rp 6.500.000
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 9500000.0; // Golongan C: Rp 9.500.000
        } else {

            System.out.println("\n[Error] Golongan '" + golongan + "' tidak valid");
            System.out.println("Pilihan golongan karyawan (A, B, atau C)");
            input.close();
            return;
        }


        System.out.print("Jumlah Jam Lembur: ");
        if (!input.hasNextInt()) {
            System.out.println("\n[Galat] Masukan jam lembur harus berupa bilangan bulat!");
            input.close();
            return;
        }
        int jamLembur = input.nextInt();

        double persenLembur = 0.0;

        // '<' untuk periksa nilai negatif
        if (jamLembur < 0) {
            System.out.println("\nError, Nilai tidak boleh negatif (" + jamLembur + ").");
            input.close();
            return;
        } 
        // '==' periksa kesamaan jam
        else if (jamLembur == 0) {
            persenLembur = 0.00; // 0%
        } else if (jamLembur == 1) {
            persenLembur = 0.30; // 30% dari Gaji Pokok
        } else if (jamLembur == 2) {
            persenLembur = 0.32; // 32% dari Gaji Pokok
        } else if (jamLembur == 3) {
            persenLembur = 0.34; // 34% dari Gaji Pokok
        } else if (jamLembur == 4) {
            persenLembur = 0.36; // 36% dari Gaji Pokok
        } 
        // '>=' lembur 5 jam atau lebih
        else { // jamLembur >= 5
            persenLembur = 0.38; // 38% dari Gaji Pokok
        }

        double gajiLembur = persenLembur * gajiPokok;

        double totalPenghasilan = gajiPokok + gajiLembur;
        System.out.println("\n");
        System.out.println("               SLIP RINCIAN PENGHASILAN KARYAWAN            ");
        System.out.println("\n");
        System.out.printf("Golongan Karyawan : Golongan %s\n", golongan.toUpperCase());
        System.out.printf("Gaji Pokok        : %s\n", formatRupiah.format(gajiPokok));
        System.out.printf("Jumlah Lembur     : %d Jam (Persentase: %.0f%%)\n", jamLembur, persenLembur * 100);
        System.out.printf("Gaji Lembur       : %s\n", formatRupiah.format(gajiLembur));
        System.out.println("\n");
        System.out.printf("TOTAL PENGHASILAN : %s\n", formatRupiah.format(totalPenghasilan));

        input.close();
    }
}
