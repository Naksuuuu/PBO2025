package tugas3;

// Relasi: Dosen → Matakuliah (Asosiasi - satu matakuliah diajar oleh satu dosen)
// Jika Dosen dihapus, Matakuliah masih bisa ada tapi tidak lengkap datanya.

public class Dosen {
    private String nidn;
    private String nama;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }
}
