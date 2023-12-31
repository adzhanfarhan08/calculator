import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int aritmatika;

        Scanner kodeProgram = new Scanner(System.in);
        System.out.println("################################");
        System.out.println("# PROGRAM CALCULATOR SEDERHANA #");
        System.out.println("################################");

        System.out.println("Silahkan pilih operator yang dipilih");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Kode program yang ingin diakses 1, 2, 3, 4\t: ");
        aritmatika = kodeProgram.nextInt();

        switch (aritmatika) {
            case 1:
                fungsiPenambahan();
                break;
            case 2:
                fungsiPengurangan();
                break;
            case 3:
                fungsiPerkalian();
                break;
            case 4:
                fungsiPembagian();
                break;
            default:
                System.out.println("KODE PROGRAM YANG ANDA MASUKKAN TIDAK DAPAT DITEMUKAN !!!");
        }
    }

    static void fungsiPenambahan() {
        prosesPerhitungan("+");
    }

    static void fungsiPengurangan() {
        prosesPerhitungan("-");
    }

    static void fungsiPerkalian() {
        prosesPerhitungan("x");
    }

    static void fungsiPembagian() {
        prosesPerhitungan(":");
    }

    static void prosesPerhitungan(String simbol) {
        int angkaPertama, angkaKedua, jumlah;
        Scanner inputAngka = new Scanner(System.in);

        System.out.print("Masukan Angka Pertama\t: ");
        angkaPertama = inputAngka.nextInt();
        System.out.print("Masukan Angka Kedua\t\t: ");
        angkaKedua = inputAngka.nextInt();


        switch (simbol) {
            case "+":
                jumlah = angkaPertama + angkaKedua;
                break;
            case "-":
                jumlah = angkaPertama - angkaKedua;
                break;
            case "x":
                jumlah = angkaPertama * angkaKedua;
                break;
            case ":":
                jumlah = angkaPertama / angkaKedua;
                break;
            default:
                return;
        }
        System.out.print("Hasil dari " + angkaPertama + " " + simbol + " " + angkaKedua + " adalah " + jumlah);
    }
}