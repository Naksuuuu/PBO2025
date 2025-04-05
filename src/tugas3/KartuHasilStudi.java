package tugas3;

import java.util.*;

// Relasi: KHS → Matakuliah (Komposisi)
// Jika KHS dihapus, maka seluruh matakuliah di dalamnya akan ikut tidak relevan dalam konteks nilai.

public class KartuHasilStudi {
    private String semester;
    private List<Matakuliah> daftarMatakuliah;
    private double ips;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public void hitungIPS() {
        double total = 0;
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah) {
            total += mk.nilaiIndex() * mk.getSks();
            totalSks += mk.getSks();
        }
        if (totalSks > 0) {
            ips = total / totalSks;
        }
    }

    public double getIPS() {
        return ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append("  ").append(mk.display()).append("\n");
        }
        sb.append("  IPS Semester Ini: ").append(String.format("%.2f", ips)).append("\n");
        return sb.toString();
    }
}
