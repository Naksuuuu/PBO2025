package pertemuan3;

public class Student {
    public String nrp;
    public String nama;
    public String alamat;
    public boolean hadir;

    public Student() {
        this.nrp = nrp;
        this.nama = nama;
        this.alamat = alamat;
    }


    public void masukKelas() {
        this.hadir = true;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

}
