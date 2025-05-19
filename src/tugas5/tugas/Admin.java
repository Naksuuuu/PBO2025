package tugas5.tugas;

public class Admin extends Pengguna implements Akses {
private boolean isLogin = false;
// wadah untuk menyimpan nilai status login
    public Admin(String nama, String username, String password) {
        super(nama, username, password);
    }

    @Override
    public boolean login(String usernameInput, String passwordInput) {

        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            isLogin = true;
            return true;
        }
        else {
            isLogin = false;
            return false;
        }
    }

    // pengecekan username dan password jika benar nilai dari wadah isLogin akan ikut berubah

    @Override
    public String tampilkanPeran() {
        return "Admin";
    }

    @Override
    public void tampilkanInfo() {
        if (isLogin) {
            System.out.println("== ADMIN ==");
            System.out.println("Nama: " + nama);
            System.out.println("Username: " + username);
        } else {
            System.out.println("Username atau Password SALAH! ");
        }

    }

    // Apa yang akan di cetak tergantung pada nilai isLogin jika login nya true maka akan menampilkan data, jika false maka akan diberi tahu usn atau psw salah.


}
