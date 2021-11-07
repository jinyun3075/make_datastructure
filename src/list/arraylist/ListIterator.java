package list.arraylist;

public interface ListIterator<T> {
    int nextIndex = 0;
    T next();

    boolean hasNext();

    T previous();

    boolean hasPrevious();

    void add(T element);

    void remove();

}
