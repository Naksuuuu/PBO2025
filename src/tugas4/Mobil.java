package tugas4;

public class Mobil extends Kendaraan {
    public String tipe;
    public String nama;
    public String warna;

    public Mobil(String merek, String tipe, String nama, String warna) {
        super(merek);
        this.tipe = tipe;
        this.nama = nama;
        this.warna = warna;
    }

    public String getTipe() {
        return tipe;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void display() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Tipe: " + getTipe());
        System.out.println("Nama: " + getNama());
        System.out.println("Warna: " + getWarna());
    }


}

