package list.linkedlist;


public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

//    노드 클래스
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

//    노드 찾기 head부터 ~
    Node node(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

//    기능
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


    public void add(int index, Object input) {
        if (index == 0) {
            addFirst(input);
            return;
        }
        if (index == size) {
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


    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object remove(int index) {
        if (index == 0) {
            return removeFirst();
        }
        Node temp = node(index - 1);
        Node deleteNode = temp.next;
        temp.next = deleteNode.next;
        Object returnData = deleteNode.data;

        if (deleteNode == tail) {
            tail = temp;
        }
        deleteNode = null;
        size--;
        return returnData;
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return node(index).data;
    }

    public int indexOf(Object data) {
        Node temp = head;

//        int index = 0;
//        while (temp.data != data) {
//            temp = temp.next;
//            index++;
//            if (temp == null){
//                return -1;
//            }
//        } check
//        return index;

        for (int i = 0; i < size; i++) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

//    출력
    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";

        while (temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public ListIterator listIterator() {
        return new ListIterator(){
            private Node next =head;
            private int nextIndex;
            private Node val;

            public Object next(){
                val = next;
                next = next.next;
                nextIndex++;
                return val.data;
            }

            public boolean hasNext(){
                return next!=null;
            }

            public void add(Object o) {
                Node newNode = new Node(o);

                if(val==null){
                    head = newNode;
                }else{
                    val.next = newNode;
                }
                newNode.next = next;
                val= newNode;
                nextIndex++;
                size++;

            }

            public Object remove() {
                if(nextIndex == 0) {
                    throw new IllegalStateException();
                }
                return LinkedList.this.remove(--nextIndex);
            }
        };
    }
}
