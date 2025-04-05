package tugas2;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    // Konstruktor
    public Matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex() {
        // Konversi nilai index ke angka
        switch (this.index) {
            case "A":  return 4.0;
            case "AB": return 3.5;
            case "B":  return 3.0;
            case "BC": return 2.5;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "E":  return 0.0;
            default:   return 0.0;
        }
    }

    public String display() {
        return kode + " - " + nama + " - " + index;
    }

    // Getter dan Setter
    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}

