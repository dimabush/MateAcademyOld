package hw.fourth;

public class MyArrayList<T> implements List<T> {

    private int size;
    private T[] array;

    public MyArrayList() {
        size = 0;
        array = (T[]) new Object[size];
    }

    public MyArrayList(T[] array) {
        this.array = array;
        size = array.length;
    }

    @Override
    public void add(T value) {
        if (size < array.length) {
            array[size] = value;
            size++;
        } else {
            T[] newArray = (T[]) new Object[size + 5];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            newArray[size] = value;
            array = newArray;
            size++;
        }
    }

    @Override
    public void add(T value, int index) {
        if (index == (size - 1)) {
            add(value);
        } else {
            int sizeNewArray;
            if (size < array.length) {
                sizeNewArray = array.length;
            } else {
                sizeNewArray = size + 5;
            }
            T[] newArray = (T[]) new Object[sizeNewArray];
            int element = 0;
            for (int i = 0; i < size + 1; i++) {
                if (i == index) {
                    newArray[i] = value;
                } else {
                    newArray[i] = array[element];
                    element++;
                }
            }
            array = newArray;
            size++;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void addAll(List<T> list) {
        if (list.size() == 1){
            this.add(list.get(0));
        } else if (list.size() > 1){
            int sizeNewArray = size + list.size();
            int element = 0;
            if (sizeNewArray < array.length){
                for (int i = size; i < sizeNewArray; i++){
                    array[i] = list.get(element);
                    element++;
                }
            } else {
                T [] newArray = (T[]) new Object[sizeNewArray];
                for (int i = 0; i < size; i++){
                    newArray[i] = array[i];
                }
                for (int i = size; i < sizeNewArray; i++){
                    newArray[i] = list.get(element);
                    element++;
                }
                array = newArray;
            }
            size = sizeNewArray;
        }
    }

    @Override
    public void set(T value, int index) {
        this.array[index] = value;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T remove(T value) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(array[0].toString());
        for (int i = 1; i < size; i++) {
            result.append(", ").append(array[i]);
        }
        return result.toString();
    }

}
