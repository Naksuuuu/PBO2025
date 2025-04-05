package tugas3;


// Relasi: Matakuliah → Dosen (Asosiasi) dan Matakuliah → KartuHasilStudi (Komposisi)
// Jika Matakuliah dihapus, KHS akan kehilangan data nilai.

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    private Dosen dosenPengampu;
    private String semester;

    public Matakuliah(String kode, String nama, String index, int sks, Dosen dosenPengampu, String semester) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
        this.semester = semester;
    }

    public double nilaiIndex() {
        return switch (index) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    public int getSks() {
        return sks;
    }

    public String getSemester() {
        return semester;
    }

    public String display() {
        return kode + " - " + nama + " - " + index + " - Dosen: " +
                dosenPengampu.getNama() + " (NIDN: " + dosenPengampu.getNidn() + ")";
    }
}
