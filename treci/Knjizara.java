package treci;

import java.util.ArrayList;
import java.util.List;

public class Knjizara {
    private ArrayList<Knjiga> listaKnjiga;

    public Knjizara(ArrayList<Knjiga> listaKnjiga){
        this.listaKnjiga = listaKnjiga;
    }

    public Knjizara(){}

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public String ispisiKomentare(int index){
        Knjiga k = listaKnjiga.get(index);

        return k.prikazKomentara();
    }
}
