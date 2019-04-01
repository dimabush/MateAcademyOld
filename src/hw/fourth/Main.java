package hw.fourth;

public class Main {
    public static void main(String[] args) {
//        realization of MyLinkedList
        List<String> myList = new MyLinkedList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("is easy");
        myList.add("program");
        System.out.println(myList);

        myList.add("qq", 3);
        System.out.println(myList);

        System.out.println(myList.size());

        System.out.println(myList.get(4));

        MyLinkedList<String> mySecondList = new MyLinkedList<>();
        mySecondList.add("Second");
        mySecondList.add("Third");
        mySecondList.add("Fourth");
        mySecondList.add("Second");
        System.out.println(mySecondList);

        mySecondList.set("NEW Fourth", 2);
        System.out.println(mySecondList.remove(1));

        System.out.println(mySecondList.remove("Second"));

        myList.addAll(mySecondList);
        System.out.println(myList);

//        realization of MyArrayList
        List<String> myArrayList = new MyArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two", 1);
        myArrayList.add("Three");
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());


    }
}
