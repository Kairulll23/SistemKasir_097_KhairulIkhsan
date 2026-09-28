package minpro.sistemkasir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produk[] daftarProduk = {
            new Makanan("Nasi Goreng", 25000),
            new Minuman("Es Teh", 5000),
            new Makanan("Mie Goreng", 18000),
            new Minuman("Jus Jeruk", 10000)
        };

        System.out.println("==================================");
        System.out.println("       SISTEM KASIR TOKO");
        System.out.println("==================================");

        double total = 0;

        // Looping untuk menampilkan produk
        for (int i = 0; i < daftarProduk.length; i++) {

            System.out.println("\nProduk ke-" + (i + 1));
            daftarProduk[i].tampilkanInfo();

            total += daftarProduk[i].hitungHarga();
        }

        System.out.println("\n==================================");
        System.out.println("Total Belanja : Rp" + total);

        double diskon;

        // Condition if-else untuk menentukan diskon
        if (total >= 100000) {
            diskon = total * 0.10;
            System.out.println("Diskon 10%    : Rp" + diskon);

        } else if (total >= 50000) {
            diskon = total * 0.05;
            System.out.println("Diskon 5%     : Rp" + diskon);

        } else {
            diskon = 0;
            System.out.println("Diskon        : Rp0");
        }

        double totalBayar = total - diskon;

        System.out.println("Total Bayar   : Rp" + totalBayar);
        System.out.println("==================================");
        System.out.println("      TERIMA KASIH");
        System.out.println("==================================");

        input.close();
    }
}
