package treci;

public abstract class Knjiga implements PrikazKomentara{
    protected String naslov, autor;
    protected int brNaStanju;
    protected String[] komentari;

    public Knjiga(String naslov, String autor, int brNaStanju, String[] komentari){
        this.autor = autor;
        this.brNaStanju = brNaStanju;
        this.naslov = naslov;
        this.komentari = komentari;
    }

    public int getBrNaStanju() {
        return brNaStanju;
    }

    public String getAutor() {
        return autor;
    }

    public String getNaslov() {
        return naslov;
    }

    public String[] getKomentari() {
        return komentari;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setBrNaStanju(int brNaStanju) {
        this.brNaStanju = brNaStanju;
    }

    public void setKomentari(String[] komentari) {
        this.komentari = komentari;
    }

    public abstract String prikazInformacija();

    @Override
    public String prikazKomentara() {
        StringBuilder prikaz = new StringBuilder();
        prikaz.append("Komentari za knjigu " + this.naslov + ": \n");
        for(int i = 0; i < komentari.length; i++){
            prikaz.append(komentari[i] + "\n");
        }

        return prikaz.toString();
    }
}
