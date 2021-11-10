package list.arraylist;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.addFirst(30);
        arr.add(0,10);
        arr.add(1,20);
        arr.addLast(40);
        arr.addLast(50);

//        System.out.println("add............: "+arr);
//
//        arr.removeFirst();
//        arr.removeLast();
//
//        System.out.println("remove.........: "+arr.remove(1)+", "+arr);
//
//
//        System.out.println("get............: "+arr.get(1));
//        System.out.println("size...........: "+arr.size());
//        System.out.println("indexOf........: "+arr.indexOf(40)+" "+arr.indexOf(20));

        ListIterator<Integer> li = arr.listIterator();

        while (li.hasNext()){
            int num = li.next();
            if(num==30){
                System.out.println(li.next());
            }
        }
        System.out.println(arr);
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
//        }



    }
}
