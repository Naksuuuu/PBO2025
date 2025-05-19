package tugas5.latihan2;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }
    // Dalam kasus ini, ini akan menjadi Database nya(data pembanding yang akan menentukan true atau falsenya nanti)

    @Override
    public boolean otentikasi(String pinInput) {
        if (pin.equals(pinInput))
            return true;
        else
            return false;
    }
    // jika pin yang di input kan sama dengan pin yang ada di database maka akan mengembalikan nilai true
    // jika  tidak maka aka mengembalikan nilai false




    @Override
    public String encode(String pin) {
        StringBuilder sb = new StringBuilder();
        for (char c : pin.toCharArray()) {
            sb.append((char)(c + 1));
        }
        return sb.toString();
    }

    // Enkripsi sederhana: geser setiap karakter PIN +1
    // Misalnya angka 1 -> 2, 2 -> 3 dan seterusnya
}
