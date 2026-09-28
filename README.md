# Sistem Kasir Toko Sederhana

## Deskripsi Proyek

Sistem Kasir Toko Sederhana merupakan program berbasis Java yang dibuat untuk menerapkan konsep dasar Object Oriented Programming (OOP).

Program ini digunakan untuk menampilkan daftar produk, menghitung harga produk, menghitung total belanja, dan menentukan diskon berdasarkan jumlah total pembelian.

Program dibuat menggunakan konsep inheritance, polymorphism, condition, dan looping sesuai dengan ketentuan tugas UTS.

## Tujuan

Tujuan pembuatan program ini adalah:

- Menerapkan konsep dasar OOP menggunakan Java.
- Memahami penggunaan inheritance.
- Menerapkan polymorphism dengan method overriding.
- Menggunakan if-else untuk membuat kondisi program.
- Menggunakan looping untuk memproses beberapa data.
- Membuat program sederhana yang dapat dijalankan melalui terminal atau IDE Java.

## Konsep OOP yang Digunakan

### 1. Inheritance

Inheritance digunakan untuk membuat class turunan dari class `Produk`.

Struktur inheritance pada program:

```text
Produk
├── Makanan
└── Minuman
````

Class `Makanan` dan `Minuman` merupakan child class yang mewarisi atribut dan method dari class `Produk`.

Contoh penggunaan inheritance pada class `Makanan`:

```java
public class Makanan extends Produk
```

Contoh penggunaan inheritance pada class `Minuman`:

```java
public class Minuman extends Produk
```

Dengan menggunakan inheritance, class `Makanan` dan `Minuman` dapat menggunakan atribut dan method yang terdapat pada class `Produk` tanpa harus membuatnya kembali.

### 2. Polymorphism

Polymorphism digunakan untuk membuat satu method memiliki perilaku yang berbeda pada class yang berbeda.

Pada program ini polymorphism diterapkan menggunakan method overriding.

Method yang dioverride adalah `hitungHarga()` dan `tampilkanInfo()`.

Pada class `Makanan`, method `hitungHarga()` digunakan untuk menambahkan biaya sebesar Rp2.000.

Contohnya:

```java
@Override
public double hitungHarga() {
    return harga + 2000;
}
```

Sedangkan pada class `Minuman`, method `hitungHarga()` digunakan untuk menambahkan biaya sebesar Rp1.000.

Contohnya:

```java
@Override
public double hitungHarga() {
    return harga + 1000;
}
```

Dengan demikian, method yang sama dapat memiliki perilaku yang berbeda sesuai dengan object yang digunakan.

### 3. Condition

Condition digunakan untuk menentukan keputusan berdasarkan kondisi tertentu.

Pada program ini condition digunakan untuk menentukan jumlah diskon berdasarkan total belanja.

Program menggunakan `if`, `else if`, dan `else`.

Contohnya:

```java
if (total >= 100000) {
    diskon = total * 0.10;
} else if (total >= 50000) {
    diskon = total * 0.05;
} else {
    diskon = 0;
}
```

Ketentuan diskon pada program adalah:

* Total belanja minimal Rp100.000 mendapatkan diskon 10%.
* Total belanja minimal Rp50.000 mendapatkan diskon 5%.
* Total belanja di bawah Rp50.000 tidak mendapatkan diskon.

### 4. Looping

Looping digunakan untuk menjalankan perintah secara berulang.

Pada program ini looping digunakan untuk menampilkan seluruh produk yang terdapat di dalam array dan menghitung total harga produk.

Program menggunakan perulangan `for`.

Contohnya:

```java
for (int i = 0; i < daftarProduk.length; i++) {
    daftarProduk[i].tampilkanInfo();
    total += daftarProduk[i].hitungHarga();
}
```

Perulangan tersebut akan berjalan sesuai dengan jumlah data produk yang terdapat di dalam array `daftarProduk`.

## Struktur Class

Program terdiri dari empat class utama, yaitu:

```text
Produk.java
Makanan.java
Minuman.java
Main.java
```

Struktur hubungan antar class:

```text
             Produk
             /    \
            /      \
       Makanan    Minuman
            \      /
             \    /
              Main
```

### Produk.java

Class `Produk` merupakan parent class yang digunakan untuk menyimpan atribut dasar produk.

Atribut yang digunakan adalah:

* `nama`
* `harga`

Class ini juga memiliki method `hitungHarga()` dan `tampilkanInfo()`.

### Makanan.java

Class `Makanan` merupakan child class dari `Produk`.

Class ini menggunakan inheritance dan melakukan overriding terhadap method `hitungHarga()` dan `tampilkanInfo()`.

### Minuman.java

Class `Minuman` merupakan child class dari `Produk`.

Class ini juga menggunakan inheritance dan melakukan overriding terhadap method `hitungHarga()` dan `tampilkanInfo()`.

### Main.java

Class `Main` merupakan class utama yang digunakan untuk menjalankan program.

Class ini membuat beberapa object produk, menampilkan data produk, menghitung total harga, menentukan diskon, dan menampilkan total pembayaran.

## Alur Program

Alur kerja program dimulai dengan membuat beberapa data produk yang terdiri dari makanan dan minuman.

Setelah data produk dibuat, program menyimpan data tersebut ke dalam array `daftarProduk`.

Program kemudian menggunakan looping untuk memproses setiap produk yang terdapat di dalam array.

Setiap produk akan menampilkan jenis produk, nama produk, dan harga produk.

Setelah semua produk diproses, program akan menghitung total harga seluruh produk.

Selanjutnya program menggunakan condition `if-else` untuk menentukan jumlah diskon berdasarkan total belanja.

Setelah diskon ditentukan, program menghitung total pembayaran dengan cara mengurangi total belanja dengan jumlah diskon.

Kemudian program menampilkan total belanja, jumlah diskon, dan total pembayaran.

Alur program dapat digambarkan sebagai berikut:

```text
Mulai
  |
  v
Membuat data produk
  |
  v
Menyimpan produk ke dalam array
  |
  v
Menampilkan produk menggunakan looping
  |
  v
Menghitung harga setiap produk
  |
  v
Menghitung total belanja
  |
  v
Menentukan diskon menggunakan if-else
  |
  v
Menghitung total pembayaran
  |
  v
Menampilkan hasil transaksi
  |
  v
Selesai
```

## Cara Menjalankan Program

Program dapat dijalankan menggunakan Java Development Kit atau JDK.

### 1. Clone Repository

Clone repository GitHub menggunakan perintah:

```bash
git clone https://github.com/username/UTS-OOP-Java-Kasir.git
```

Ganti `username` dengan username GitHub masing-masing.

### 2. Masuk ke Folder Project

Setelah repository berhasil di-clone, masuk ke folder project menggunakan perintah:

```bash
cd UTS-OOP-Java-Kasir
```

### 3. Masuk ke Folder Source

Masuk ke folder `src` menggunakan perintah:

```bash
cd src
```

### 4. Compile Program

Compile seluruh file Java menggunakan perintah:

```bash
javac *.java
```

Jika tidak terdapat error, proses compile berhasil dilakukan.

### 5. Menjalankan Program

Setelah proses compile selesai, jalankan class utama menggunakan perintah:

```bash
java Main
```

Program kemudian akan menampilkan hasil sistem kasir pada terminal.

## Contoh Output Program

Contoh hasil ketika program dijalankan: 

<img width="255" height="524" alt="image" src="https://github.com/user-attachments/assets/40782e3b-55f6-4120-9b4d-f624d994fd42" /> 

## Penjelasan Gambar

### Gambar 1. Tampilan Awal Program

Pada gambar pertama terlihat tampilan awal program `Sistem Kasir Toko`. Program menampilkan judul sistem sebelum memproses data produk.

### Gambar 2. Tampilan Daftar Produk

Pada gambar kedua terlihat daftar produk yang terdiri dari makanan dan minuman.

Data produk ditampilkan menggunakan proses looping sehingga program dapat memproses beberapa produk secara otomatis.

### Gambar 3. Tampilan Perhitungan Harga

Pada gambar ketiga terlihat harga dari masing-masing produk.

Harga produk dihitung menggunakan method `hitungHarga()` yang terdapat pada masing-masing class.

Method tersebut menunjukkan penerapan polymorphism karena method yang sama memiliki implementasi berbeda pada class `Makanan` dan `Minuman`.

### Gambar 4. Tampilan Diskon

Pada gambar keempat terlihat hasil perhitungan diskon.

Program menggunakan `if-else` untuk menentukan diskon berdasarkan total belanja.

Pada contoh output, total belanja sebesar Rp64.000 sehingga mendapatkan diskon sebesar 5%.

### Gambar 5. Tampilan Total Pembayaran

Pada gambar kelima terlihat total pembayaran setelah dikurangi dengan diskon.

Total belanja sebesar Rp64.000 mendapatkan diskon sebesar Rp3.200 sehingga total pembayaran menjadi Rp60.800.

## Struktur Folder Project

Struktur folder project pada GitHub adalah:

```text
UTS-OOP-Java-Kasir
│
├── src
│   ├── Produk.java
│   ├── Makanan.java
│   ├── Minuman.java
│   └── Main.java
│
└── README.md
```

## Teknologi yang Digunakan

Teknologi yang digunakan dalam project ini adalah:

* Java
* Object Oriented Programming (OOP)
* Java Development Kit (JDK)
* Git
* GitHub

## Kesimpulan

Program Sistem Kasir Toko Sederhana berhasil dibuat menggunakan bahasa Java dengan menerapkan konsep dasar Object Oriented Programming.

Konsep inheritance diterapkan melalui class `Produk` sebagai parent class dan class `Makanan` serta `Minuman` sebagai child class.

Konsep polymorphism diterapkan melalui method overriding pada method `hitungHarga()` dan `tampilkanInfo()`.

Konsep condition diterapkan menggunakan `if-else` untuk menentukan diskon berdasarkan total belanja.

Konsep looping diterapkan menggunakan perulangan `for` untuk memproses dan menampilkan beberapa data produk.

Dengan penerapan konsep tersebut, program dapat melakukan proses perhitungan transaksi sederhana secara terstruktur dan mudah dipahami.

## Saran

Program ini masih merupakan sistem kasir sederhana sehingga masih dapat dikembangkan lebih lanjut.

Pengembangan yang dapat dilakukan antara lain menambahkan input produk secara langsung dari pengguna, menambahkan jumlah barang, menambahkan fitur pembayaran, menghitung kembalian, menyimpan riwayat transaksi, dan menghubungkan program dengan database.

## Identitas

Nama: Khairul Ikhsan

NIM: 2509116097

Kelas: C'25

Mata Kuliah: Pemrograman Berorientasi Objek

Tugas: Ujian Tengah Semester (UTS)
