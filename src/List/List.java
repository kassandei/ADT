package List;

public interface List {
    Object read();
    void flush();
    boolean insert(Object obj);
    Object extract();
    int nElem();
    void reset();
    boolean moveNext();
    boolean hasNext();
    boolean isEmpty();
    boolean isFull();
    boolean seek(int position);
    int peek();
}
