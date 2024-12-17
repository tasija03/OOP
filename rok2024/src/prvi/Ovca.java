package prvi;

public class Ovca extends Zivotinja{

    private int brParola = 0;
    private int i = 0;

    static private int brOvaca = 0;

    private String[] nizParola;
    public Ovca(String ime, String[] nizParola) {
        super(ime);
        this.nizParola = nizParola;
        brOvaca++;
        this.brParola = nizParola.length;
    }

    public Ovca(Ovca o){
        super(o);
        this.nizParola = o.nizParola;
        brOvaca++;
        this.brParola = o.nizParola.length;
    }

    public String[] getNizParola() {
        return nizParola;
    }

    public void setNizParola(String[] nizParola) {
        this.nizParola = nizParola;
        brParola = nizParola.length;
    }

    @Override
    public String toString() {
        return "Ovca kaze " + nizParola[(i++) % brParola];
    }

    public void uglas(){
        for (int j = 0; j < brOvaca; j++){
            System.out.println(nizParola[i % brParola]);
        }
    }

    public void naredi(Direktiva d){
        if(d.getIme().equals(this.ime)){
            String[] tmp = new String[]{d.getNaredba()};
            this.nizParola = tmp;
            i = 0;
        }
    }
}
