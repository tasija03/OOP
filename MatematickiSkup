package drugi;

import java.util.Optional;


public class MatematickiSkup <T extends Comparable<T>>{
    private String imeSkupa;
    private int inicijalniKapacitet;
    private T[] elementi;
    private int brElemenata = 0;

    public MatematickiSkup(String imeSkupa, int kapacitet){
        this.imeSkupa = imeSkupa;
        this.inicijalniKapacitet = kapacitet;
        elementi = (T[]) new Comparable[inicijalniKapacitet];
    }

    public boolean postoji(T element){
        for(int i = 0; i < brElemenata; i++){
            if(elementi[i].compareTo(element) == 0){
                return true;
            }
        }
        return false;
    }
    public void dodaj(T element){

        if(postoji(element)) return;

        if(inicijalniKapacitet == 0) inicijalniKapacitet = 1;
        if(brElemenata >= inicijalniKapacitet){
            inicijalniKapacitet *= 2;
            T[] tmp = (T[]) new Comparable[inicijalniKapacitet];
            for(int i = 0; i < brElemenata; i++) tmp[i] = elementi[i];
            elementi = tmp;
        }

        elementi[brElemenata++] = element;
    }
    public Optional<T> nadjiMaximum(){
        if(inicijalniKapacitet == 0) return Optional.empty();

        T max = elementi[0];
        for(int i = 1; i < brElemenata; i++){
            if(elementi[i].compareTo(max) > 0) max = elementi[i];
        }

        return Optional.of(max);
    }

    public MatematickiSkup<T> unija(MatematickiSkup<T> s){
        MatematickiSkup<T> unijaSkpova = new MatematickiSkup<>(this.imeSkupa + s.imeSkupa,this.inicijalniKapacitet + s.inicijalniKapacitet);
        int i = 0;
        for( i = 0; i < this.brElemenata; i++) unijaSkpova.elementi[i] = this.elementi[i];
        for(int j = 0; j < s.brElemenata; j++) unijaSkpova.elementi[i] = s.elementi[j];
        return unijaSkpova;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ ");
        for(int i = 0; i < brElemenata; i++) s.append("" + elementi[i] + ", ");
        s.append("}");

        return s.toString();
    }
}
