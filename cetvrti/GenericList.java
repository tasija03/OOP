package cetvrti;

public interface GenericList<T>{
    public void dodaj(T element);
    public T ukloni();
    public int count(T element);
}
