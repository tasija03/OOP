package cetvrti;

public class Main {
    public static void main(String[] args) {

        JednostrukaLista<Vektor> lista = new JednostrukaLista<Vektor>();

        lista.dodaj(new Vektor(2, 3, 15));
        lista.dodaj(new Vektor(1, 12, 6));
        lista.dodaj(new Vektor(8, 4, 12));
        lista.dodaj(new Vektor(2, 3, 15));
        lista.dodaj(new Vektor(4, 8, 29));

        System.out.println(lista);

        Vektor noviVektor = new Vektor(2, 3, 15);
        Vektor noviVektor2 = new Vektor(15, 9, 24);

        System.out.println(lista.count(noviVektor));
        System.out.println(lista.count(noviVektor2));
    }
}
