package tugas5.latihan1;



public class Main {
    public static void main(String[] args) {
        Bentuk lingkaran = new Lingkaran(10);     // jari-jari 7
        Bentuk tabung = new Tabung(10, 5);       // jari-jari 7, tinggi 10

    }
}


/*
1. Method abstrak yang terdapat di kelas Bentuk adalah:
        public abstract double luas();
        Method ini tidak memiliki isi (implementasi) di dalam kelas Bentuk, dan harus diimplementasikan oleh semua subclass-nya seperti Lingkaran dan Tabung.
2. Perbedaan Method luas pada class Bentuk dan (Lingkaran dan Tabung)
        Pada Class Bentuk method luas hanya sebuah kerangka agar kelas turunanya memakai method tersebut sedangkan pada kelas turunannya harus memmakai/mengimplementasikan
        method luas yang isinya bisa apa saja, dalam kasus ini menghitung luas tabung atau lingkaran
3. Jika di kelas turunannya tidak memakai method luas :
        Compiler akan membacanya sebagai error berikut:
        Class 'Lingkaran' must either be declared abstract or implement abstract method 'luas()' in 'Bentuk'
4. Kelas ini menjawab no 4 jika di run
5. ada pada gambar yang saya upload
 */

