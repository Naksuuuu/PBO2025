package tugas2;

public class Mahasiswa {
    private String nrp;
    private String nama;


    public Mahasiswa(String nrp, String nama) {
        super();
        nrp = nrp;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + nrp + " - Nama: " + nama;
    }

    // Getter dan Setter
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

