/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minpro.sistemkasir;

public class Makanan extends Produk {

    public Makanan(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungHarga() {
        return harga + 2000;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis : Makanan");
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + hitungHarga());
    }
}