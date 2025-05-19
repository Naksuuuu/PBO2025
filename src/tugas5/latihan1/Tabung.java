package tugas5.latihan1;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung() {
        super(0);
    }

    public Tabung(int jari2,int tinggi) {
        super(jari2);
        this.tinggi = tinggi ;
        tampilkan();
    }

//    L: 2phi * r (r+t)

    @Override
    public double luas() {
        return 2*PHI*jari2*(jari2 + tinggi);
    }

    // Setter and Getter

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void tampilkan() {
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + jari2 + ", Tinggi:" + tinggi);
        System.out.println("luas:" + luas());
    }
}