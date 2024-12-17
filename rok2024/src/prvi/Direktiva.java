package prvi;

public class Direktiva {
    private String ime;
    private String naredba;

    public Direktiva(String ime, String naredba){
        this.ime = ime;
        this.naredba = naredba;
    }

    public Direktiva(Direktiva d){
        this.ime = d.ime;
        this.naredba = d.naredba;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setNaredba(String naredba) {
        this.naredba = naredba;
    }

    public String getNaredba() {
        return naredba;
    }

    @Override
    public String toString() {
        return "Direktiva: " + ime + ", " + naredba;
    }
}
