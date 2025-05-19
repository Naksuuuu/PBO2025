package tugas5.tugas;

public abstract class Pengguna {
    protected String nama;
    protected String username;
    protected String password;

    public Pengguna(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public abstract void tampilkanInfo();
}


/*
Pengguna adalah kelas abstrak.
Memiliki data nama, username, password.
Memiliki method abstrak tampilkanInfo() → harus diimplementasikan di kelas turunan.
 */