package list.linkedlist;



public class LinkedList {
    private Node head;
    private Node tail;
    private int size=0;
    private class Node{
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
}
