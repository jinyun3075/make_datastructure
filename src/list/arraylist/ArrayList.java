package list.arraylist;

public class ArrayList<T> {
    private int size = 0; // ArrayList 크기
    private Object[] data = new Object[100]; // 수용할 수 있는 리스트 크기 100개

    /*
        데이터 생성
            Array 사이에 데이터를 넣기위해 입력된 인덱스값부터 배열값 뒤로 밀어넣기
     */
    public boolean add(int index, T element) {

        if (check(index)) return false;
        for (int i = size - 1; index <= i; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
        return true;
    }

    public boolean addLast(T element) {
        data[size] = element;
        size++;
        return true;
    }

    public boolean addFirst(T element) {
        if (size == 0) {
            return addLast(element);
        }
        return add(0, element);
    }

    /*
        데이터 삭제
            받은 인덱스에 삭제하고 뒤에있는 데이터를 당겨와야한다.
     */
    public T remove(int index) {
        if (check(index)) return null;
        T removed = (T)data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        data[size] = null;

        return removed;
    }

    public T removeFirst() {
        return remove(0);
    }

    public T removeLast() {
        return remove(size - 1);
    }

    /*
        데이터 가져오기
     */
    public T get(int index) {
        if (check(index)) return null;
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(T val){
        for(int i=0;i<size;i++){
            if(val.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public ListIterator<T> listIterator(){
        return new ListIterator<T>() {

            private int nextIndex = 0;
            public T next(){
                return (T)data[nextIndex++];
            }

            public boolean hasNext(){
                return data[nextIndex]!=null;
            }

            public T previous(){
                return (T)data[--nextIndex];
            }

            public boolean hasPrevious(){
                return nextIndex > 0;
            }

            public void add(T element){
                ArrayList.this.add(nextIndex++,element);
            }

            public void remove(){
                ArrayList.this.remove(--nextIndex);
            }
        };
    }

    /*
        인덱스 사이즈 확인인
     */
    private boolean check(int index) {
        if (index > size - 1) {
            System.out.println("가지고 있는 배열의 범위를 초과하였습니다!");
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += data[i];
            if (i != size - 1)
                str += ",";
        }
        return str + "]";
    }


}
