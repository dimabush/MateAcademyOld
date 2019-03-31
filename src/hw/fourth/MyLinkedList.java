package hw.fourth;

public class MyLinkedList<T> implements List<T> {

    private Node firstNode;
    private Node lastNode;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    class Node {
        Node prev;
        Node next;
        T value;

        Node(Node prev, Node next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        if (size == 0) {
            firstNode = new Node(null, null, value);
            lastNode = firstNode;
        } else if (size == 1) {
            lastNode = new Node(firstNode, null, value);
            firstNode.next = lastNode;
        } else {
            Node currentNode = new Node(lastNode, null, value);
            lastNode.next = currentNode;
            lastNode = currentNode;
        }
        size++;
    }

    @Override
    public String toString() {
        Node currentNode = firstNode;
        StringBuilder result = new StringBuilder(currentNode.value.toString());
        while (currentNode.next != null){
            currentNode = currentNode.next;
            result.append(", ").append(currentNode.value.toString());
        }
        return result.toString();
    }
}
