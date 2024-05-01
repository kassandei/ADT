package Stack;

import java.io.Serializable;

public interface Stack extends Cloneable, Serializable {
    public void push(Object obj);
    public Object pop();
    public Object top();
    public boolean isEmpty();
    public boolean isFull();
    public int nElem();
    public void flush();
}
