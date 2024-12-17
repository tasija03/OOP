package drugi;

public class Osoba implements Comparable<Osoba>{
    private String ime, prezime;

    public Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }
    @Override
    public int compareTo(Osoba o) {
        int res = this.ime.compareTo(o.ime);
        if(res == 0) return this.prezime.compareTo(o.prezime);

        return res;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
