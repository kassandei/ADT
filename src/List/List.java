package List;

public interface List {
    public Object read();
    public void flush();
    public boolean insert(Object obj);
    public Object extract();
    public int nElem();
    public void reset();
    public boolean moveNext();
    public boolean hasNext();
    public boolean isEmpty();
    public boolean isFull();
    public boolean seek(int position);
    public int peek();
}
