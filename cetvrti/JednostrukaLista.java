package cetvrti;

import java.util.Objects;

public class JednostrukaLista<T extends Comparable> implements GenericList<T>{

    private class Cvor<G>{
        G vrednost;
        Cvor<G> sledeci;

        public Cvor(G vrednost){
            Objects.requireNonNull(vrednost, "Ne sme biti null!");
            this.vrednost = vrednost;
        }

        @Override
        public String toString() {
            return vrednost.toString();
        }
    }

    private Cvor<T> glava;

    public JednostrukaLista(){}
    @Override
    public void dodaj(T element) {
        if(glava == null){
            glava = new Cvor<>(element);
            return;
        }

        Cvor<T> novi = new Cvor<>(element);
        Cvor<T> tmp = glava;
        while (glava.sledeci != null){
            glava = glava.sledeci;
        }
        glava.sledeci = novi;
        glava = tmp;
    }

    @Override
    public T ukloni() {
        if(glava == null){
            throw new NullPointerException();
        }
        Cvor<T> tmp = glava;
        while (glava.sledeci.sledeci != null){
            glava = glava.sledeci;
        }

        Cvor<T> izbaci = glava.sledeci;
        glava.sledeci = null;
        glava = tmp;

        return izbaci.vrednost;
    }

    @Override
    public int count(T element) {
        if(glava == null){
            throw new NullPointerException();
        }

        Cvor<T> iterator = glava;
        int brojac = 0;
        while (iterator != null){
            if(iterator.vrednost.compareTo(element) == 0){
                brojac++;
            }

            iterator = iterator.sledeci;
        }

        return brojac;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append("[");
        Cvor<T> iterator = glava;
        while (iterator != null){
            sb.append(iterator.vrednost).append(" ");
            iterator = iterator.sledeci;
        }
        sb.append("]");

        return sb.toString();
    }

}
