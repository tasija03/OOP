package treci;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Knjizara mojaKnjizara = new Knjizara();

        String[] komentari = {"Odlicna knjiga!", "Sve preporuke", "Uzivala sam"};
        String[] komentari2 = {"Jako zanimljiva knjiga", "Nije mi se svidela"};
        String[] komentarin = {"Zanimljiva oblast", "Jako lepo napisano", "Domisljato i precizno objasnjeno"};

        Roman r1 = new Roman("Zlocin i kazna", "Lav Tolstoj", 5, komentari, "klasik");
        Roman r2 = new Roman("Na Drini cuprija", "Ivo Andric", 12, komentari2, "domaca literatura");
        NaucnaKnjiga n1 = new NaucnaKnjiga("O svemiru", "Grupa autora", 3, komentarin, "fizika");

        ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
        listaKnjiga.add(r1);
        listaKnjiga.add(r2);
        listaKnjiga.add(n1);

        mojaKnjizara.setListaKnjiga(listaKnjiga);

        for(int i = 0; i < listaKnjiga.size(); i++){
            System.out.println(mojaKnjizara.getListaKnjiga().get(i).prikazInformacija());
        }

        System.out.println(mojaKnjizara.ispisiKomentare(2));
    }
}
