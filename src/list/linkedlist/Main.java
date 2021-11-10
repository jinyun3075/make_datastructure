package list.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList arr = new LinkedList();

        arr.addFirst(20);
        arr.addFirst(10);
        arr.addLast(30);
        arr.add(1,15);

        System.out.println(arr);
    }
}
