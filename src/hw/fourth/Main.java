package hw.fourth;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("from me");
        System.out.println(myList);
    }
}
