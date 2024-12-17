package prvi;

public class Zivotinja {
    protected String ime;

    public Zivotinja(String ime){
        this.ime = ime;
    }

    public Zivotinja(Zivotinja z){
        this.ime = z.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        return "";
    }
}
