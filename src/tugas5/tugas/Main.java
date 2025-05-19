package tugas5.tugas;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Budi", "admin1", "adminpass");
        User user = new User("Siti", "user1", "userpass");
        User user2 = new User("Iman", "user2", "userpass");

        System.out.println("Login Admin: " + admin.login("admin1", "adminpass"));
        admin.tampilkanInfo();
        System.out.println("Peran: " + admin.tampilkanPeran());

        System.out.println();

        System.out.println("Login User: " + user.login("user1", "userpass"));
        user.tampilkanInfo();
        System.out.println("Peran: " + user.tampilkanPeran());

        System.out.println();

        System.out.println("Login User: " + user2.login("user", "userpass"));
        user2.tampilkanInfo();
        System.out.println("Peran: " + user2.tampilkanPeran());
    }
}

