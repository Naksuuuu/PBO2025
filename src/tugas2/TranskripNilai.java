package tugas2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    // Konstruktor
    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0;
        int totalSks = 0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalNilai += khs.getIps();
            totalSks++;
        }
        if (totalSks > 0) {
            ipk = totalNilai / totalSks;
        } else {
            ipk = 0.0;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}

