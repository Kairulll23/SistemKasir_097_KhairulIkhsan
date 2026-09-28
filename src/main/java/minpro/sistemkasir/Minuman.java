package minpro.sistemkasir;

public class Minuman extends Produk {

    public Minuman(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungHarga() {
        return harga + 1000;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis : Minuman");
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + hitungHarga());
    }
}
