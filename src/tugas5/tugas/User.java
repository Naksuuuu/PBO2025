package tugas5.tugas;

public class User extends Pengguna implements Akses {
    private boolean isLogin = false;

    public User(String nama, String username, String password) {
        super(nama, username, password);
    }

    @Override
    public boolean login(String usernameInput, String passwordInput) {
        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            isLogin = true;
            return true;
        } else {
            isLogin = false;
            return false;
        }
    }

    @Override
    public String tampilkanPeran() {
        return "User";
    }

    @Override
    public void tampilkanInfo() {
        if (isLogin) {
            System.out.println("== USER ==");
            System.out.println("Nama: " + nama);
            System.out.println("Username: " + username);
        } else {
            System.out.println("Username atau Password SALAH!");
        }
    }
}

