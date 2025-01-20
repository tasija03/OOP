package treci;

public class Roman extends Knjiga{

    private String zanr;

    public Roman(String naslov, String autor, int brNaStanju, String[] komentari, String zanr) {
        super(naslov, autor, brNaStanju, komentari);
        this.zanr = zanr;
    }

    @Override
    public String prikazInformacija() {
        return "Naslov: " + this.naslov + ", zanr: " + this.zanr + ", autor: " + this.autor +
                ", broj na stanju: " + brNaStanju;
    }
}
