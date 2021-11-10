package list.linkedlist;



public class LinkedList {
    private Node head;
    private Node tail;
    private int size=0;
    private class Node {
        private Object data;
        private Node next;
        public Node (Object input) {
            data=input;
            next =null;
        }
        public String toString(){
            return String.valueOf(data);
        }
    }

    public void addFirst(Object input){
        Node newNode= new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        if(size == 0) {
            addFirst(input);
        } else {
            Node newNode = new Node(input);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
}
