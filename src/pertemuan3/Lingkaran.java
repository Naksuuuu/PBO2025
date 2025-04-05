package pertemuan3;

public class Lingkaran {
    double jari;
private final static double phi = 3.14;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double hitungluas() {
        return  phi * jari * jari;
    }


    public double getJari2() {
        return jari;
    }

    public void setJari2(double jari) {
        this.jari = jari;
    }
}
