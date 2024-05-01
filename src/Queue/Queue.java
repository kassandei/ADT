package Queue;

import java.io.Serializable;

public interface Queue extends Cloneable, Serializable {
    public void enque(Object obj);
    public Object deque();
    public Object read();
    public boolean isEmpty();
    public boolean isFull();
    public void flush();
    public int nElem();
    public Object clone();

}
