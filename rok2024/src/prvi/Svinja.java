package prvi;

public class Svinja extends Zivotinja{

    private String parola;
    public Svinja(String ime, String parola) {
        super(ime);
        this.parola = parola;
    }

    public Svinja(String ime){
        super(ime);
        this.parola = "Sve zivotinje su jednake!";
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getParola() {
        return parola;
    }

    @Override
    public String toString() {
        return "Svinja " + ime + " kaze: " + parola;
    }
}
