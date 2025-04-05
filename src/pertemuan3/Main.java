package pertemuan3;


public class Main {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());

        ubahJari2(l2);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());

    }

    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }

}



//        Student x = new Student();
//        Student y = x;
//        x.setNrp("01");
//        y.setNrp("02");
//        System.out.println(x.getNrp());
//        Student z = new Student();
//        z.setNrp("03");
//        x = z;
//        System.out.println(x.getNrp());
//        System.out.println(y.getNrp());


//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());
//
//        l1 = null;
//        l2 = null;
//        l3 = null;



//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());
//
//        l2 = null;
//
//        System.out.println(l1.getJari2());
//        if (l2 != null) System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());




//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());
//
//        l2 = null;
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());




//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());
//
//        l2 = l3;
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//        System.out.println(l3.getJari2());


//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());
//
//        l2.setJari2(10);
//
//        System.out.println(l1.getJari2());
//        System.out.println(l2.getJari2());







//        Mahasiswa o1 = new Mahasiswa("233040088", "Ariel Wijaya", "Bandung");
//        Mahasiswa o2 = new Mahasiswa("233040089", "Wijaya", "Jakarta");
//
//        System.out.println(o1.hadir);
//        o1.masukKelas();
//        System.out.println(o1.hadir);


//        Lingkaran l1 = new Lingkaran(10);
//
//        System.out.println( l1.hitungluas());