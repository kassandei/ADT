package Queue;

import java.io.Serializable;

public interface Queue extends Cloneable, Serializable {
    void enque(Object obj);
    Object deque();
    Object read();
    boolean isEmpty();
    boolean isFull();
    void flush();
    int nElem();
    Object clone();

}
