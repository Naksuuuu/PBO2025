package tugas5.latihan2;

public interface Kartu {
    public boolean otentikasi(String pin);
    public String encode(String pin);
}


/*
Ini adalah interface yang mendefinisikan dua method:
otentikasi(String pin) → mengembalikan nilai true atau false untuk mengecek PIN.
encode(String pin) → mengembalikan PIN yang telah dienkripsi.
Interface ini tidak memiliki isi method, hanya sebagai kontrak yang harus diikuti oleh kelas yang mengimplementasikannya.

*/
