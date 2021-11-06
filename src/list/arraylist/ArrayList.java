package list.arraylist;

public class ArrayList {
    private int size = 0; // ArrayList 크기 지정
    private Object[] elementData = new Object[100]; // 수용할 수 있는 리스트 크기 100개


    /*
        데이터 생성
            Array 사이에 데이터를 넣기위해 입력된 인덱스값부터 배열값 뒤로 밀어넣기
     */
    public boolean add(int index, Object element) {

        if (check(index)) return false;
        for (int i = size - 1; index <= i; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element) {
        if (size == 0) {
            addLast(element);
            return true;
        }
        return add(0, element);
    }

    /*
        데이터 삭제
            받은 인덱스에 삭제하고 뒤에있는 데이터를 당겨와야한다.
     */
    public Object remove(int index) {
        if (check(index)) return false;
        Object removed = elementData[index];

        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }

        size--;
        elementData[size] = null;

        return removed;
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    /*
        데이터 가져오기
     */
    public Object get(int index) {
        if (check(index)) return false;
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object val){
        for(int i=0;i<size;i++){
            if(val.equals(elementData[i])){
                return i;
            }
        }
        return -1;
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
            str += elementData[i];
            if (i != size - 1)
                str += ",";
        }
        return str + "]";
    }
}
