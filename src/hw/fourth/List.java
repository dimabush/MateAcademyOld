package hw.fourth;

public interface List<T> {

    void add(T value);

    void add(T value, int index);

    int size();

    T get(int index);

    void addAll(List<T> list);

    void set(T value, int index);

    T remove(int index); // return the item that was deleted

    T remove(T value); // delete the first one to meet

    boolean isEmpty();
}
