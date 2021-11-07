package list.arraylist;

public class ListIterator<T> {
    private Object[] data;
    private int nextIndex = 0;
    ListIterator(Object[] data){
        this.data=data;
    }
    public T next(){
        return (T)data[nextIndex++];
    }

    public boolean hasNext(){
        return data[nextIndex]!=null;

    }
}
