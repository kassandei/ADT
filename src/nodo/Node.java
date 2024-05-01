package nodo;

import java.io.Serializable;

public class Node implements Serializable, Cloneable {

    protected Node next;
    protected Object data;

    public Node(Node next, Object data) {
        this.next = next;
        this.data = data;
    }

    public Node(Object data) {
        this(null, data);
    }

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //@Override
    //public Object clone() return ObjectCloner.ObjdeepCopy(this); }

    @Override
    public String toString()
    {
        return "\nData: "+data+(getNext() != null ? getNext():"");
    }
}
