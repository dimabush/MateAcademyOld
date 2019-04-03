package hw.fifth;

public class Main {
    public static void main(String[] args) {

        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Dima", 12);
        myHashMap.put("Artur", 10);
        myHashMap.put("Ivan", 8);
        myHashMap.put("Petro", 6);

        System.out.println(myHashMap.size());
        System.out.println(myHashMap);
        System.out.println(myHashMap.get("Ivan"));


        myHashMap.clear();
        System.out.println(myHashMap.size());



    }

}
