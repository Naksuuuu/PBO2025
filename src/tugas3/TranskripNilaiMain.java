package tugas3;

import java.util.*;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Dosen
        Dosen d1 = new Dosen("0001", "Bu Sinta");
        Dosen d2 = new Dosen("0002", "Pak Budi");
        Dosen d3 = new Dosen("0003", "Bu Ayu");

        // Matakuliah
        List<Matakuliah> semuaMatkul = Arrays.asList(
                new Matakuliah("001", "Algoritma 1", "A", 3, d1, "Semester 1"),
                new Matakuliah("002", "Algoritma 2", "B", 3, d2, "Semester 2"),
                new Matakuliah("003", "PBO", "A", 3, d3, "Semester 2")
        );

        // KHS berdasarkan semester
        Map<String, KartuHasilStudi> mapKHS = new HashMap<>();
        for (Matakuliah mk : semuaMatkul) {
            mapKHS.computeIfAbsent(mk.getSemester(), KartuHasilStudi::new).addMatakuliah(mk);
        }

        // Transkrip dan penghitungan IPK
        TranskripNilai transkrip = new TranskripNilai(new Date(), mhs);
        for (KartuHasilStudi khs : mapKHS.values()) {
            transkrip.addKHS(khs);
        }

        transkrip.hitungIPK();
        transkrip.display();
    }
}
