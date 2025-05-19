package tugas5.latihan1;

public class Lingkaran extends Bentuk {

    public Lingkaran(int jari2) {
        super(jari2);
        tampilkan();
    }

//  L: PHI * r * r

    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }


    public void tampilkan() {
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + jari2);
        System.out.println("luas:" + luas());
    }
}
