package list.linkedlist;


public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            data = input;
            next = null;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        if (size == 0) {
            addFirst(input);
        } else {
            Node newNode = new Node(input);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int index, Object input) {
        if (index == 0) {
            addFirst(input);
            return;
        }
        if (index == size){
            addLast(input);
            return;
        }

        Node newNode = new Node(input);
        Node temp1 = node(index - 1);
        Node temp2 = temp1.next;
        temp1.next = newNode;
        newNode.next = temp2;
        size++;
    }

    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str ="[";

        while(temp.next != null){
            str += temp+ ", ";
            temp=temp.next;
        }
        str+=temp;
        return str+"]";
    }

}
