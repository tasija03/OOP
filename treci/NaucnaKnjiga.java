package treci;

public class NaucnaKnjiga extends Knjiga{

    private String naucnaOblast;

    public NaucnaKnjiga(String naslov, String autor, int brNaStanju, String[] komentari, String naucnaOblast) {
        super(naslov, autor, brNaStanju, komentari);
        this.naucnaOblast = naucnaOblast;
    }

    @Override
    public String prikazInformacija() {
        return "Naslov: " + this.naslov + ", naucna oblast: " + this.naucnaOblast + ", autor: " + this.autor +
                ", broj na stanju: " + brNaStanju;
    }
}
