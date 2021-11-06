package list.arraylist;

public class Main {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();

        arr.addLast(10);
        arr.addLast(20);
        arr.addLast(30);
        arr.addLast(40);


        System.out.println(arr.removeFirst());
        System.out.println(arr.removeLast());
        System.out.println(arr);

    }
}
