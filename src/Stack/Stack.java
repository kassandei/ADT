package Stack;

import java.io.Serializable;

public interface Stack extends Cloneable, Serializable {
    void push(Object obj);
    Object pop();
    Object top();
    boolean isEmpty();
    boolean isFull();
    int nElem();
    void flush();
}
