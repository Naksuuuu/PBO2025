package tugas3;

// Relasi: Mahasiswa → TranskripNilai (Asosiasi)
// Jika Mahasiswa dihapus, TranskripNilai kehilangan konteks siapa pemiliknya.


public class Mahasiswa {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }
}
