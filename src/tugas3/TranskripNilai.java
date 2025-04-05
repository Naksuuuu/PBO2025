package tugas3;

import java.util.*;

// Relasi: TranskripNilai → Mahasiswa (Asosiasi), TranskripNilai → KHS (Komposisi)
// Jika TranskripNilai dihapus, maka seluruh data KHS-nya hilang.
// Tapi Mahasiswa tetap bisa eksis tanpa Transkrip.


public class TranskripNilai {
    private Date tanggalCetak;
    private Mahasiswa mahasiswa;
    private List<KartuHasilStudi> daftarKHS;
    private double ipk;

    public TranskripNilai(Date tanggalCetak, Mahasiswa mahasiswa) {
        this.tanggalCetak = tanggalCetak;
        this.mahasiswa = mahasiswa;
        this.daftarKHS = new ArrayList<>();
    }

    public void addKHS(KartuHasilStudi khs) {
        daftarKHS.add(khs);
    }

    public void hitungIPK() {
        double totalNilai = 0;
        int totalSks = 0;
        for (KartuHasilStudi khs : daftarKHS) {
            khs.hitungIPS();
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalNilai += mk.nilaiIndex() * mk.getSks();
                totalSks += mk.getSks();
            }
        }
        if (totalSks > 0) {
            ipk = totalNilai / totalSks;
        }
    }

    public void display() {
        System.out.println("NRP: " + mahasiswa.getNrp() + " - Nama: " + mahasiswa.getNama());
        System.out.println("Tanggal Cetak: " + tanggalCetak);
        System.out.println("IPK: " + String.format("%.2f", ipk));
        for (KartuHasilStudi khs : daftarKHS) {
            System.out.println(khs.display());
        }
    }
}
