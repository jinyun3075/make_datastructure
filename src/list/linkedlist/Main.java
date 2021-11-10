package list.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList arr = new LinkedList();

        arr.addFirst(20);
        arr.addFirst(10);
        arr.addLast(30);
        arr.addLast(40);
        arr.add(1,15);

        System.out.println(arr);
        System.out.println(arr.indexOf(44));
        System.out.println("리스트 사이즈 : "+arr.size());
        System.out.println("삭제 노드: "+arr.removeFirst()+"  남은 노드: "+arr);
        System.out.println("삭제 노드: "+arr.remove(1)+"  남은 노드: "+arr);
        System.out.println("삭제 노드: "+arr.removeLast()+"  남은 노드: "+arr);
        System.out.println("선택 노드: "+arr.get(1)+"  남은 노드: "+arr);
    }
}
