package tugas2;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    // Konstruktor
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah) {
            totalNilai += mk.nilaiIndex() * mk.getSks();
            totalSks += mk.getSks();
        }
        if (totalSks > 0) {
            ips = totalNilai / totalSks;
        } else {
            ips = 0.0;
        }
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }

    // Getter dan Setter
    public double getIps() {
        return ips;
    }

    public String getSemester() {
        return semester;
    }
}
