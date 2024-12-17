package drugi;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Osoba o1 = new Osoba("Anastasija", "Divjak");
        Osoba o2 = new Osoba("Mihajlo", "Besic");
        Osoba o3 = new Osoba("Andjela", "Divjak");


        MatematickiSkup<Osoba> s1 = new MatematickiSkup<>("Skup1", 0);
        MatematickiSkup<Osoba> s2 = new MatematickiSkup<>("Skup2", 0);

        s1.dodaj(o1);
        s1.dodaj(o2);
        s2.dodaj(o3);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
