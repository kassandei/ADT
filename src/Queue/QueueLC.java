package Queue;
import nodo.Node;

import javax.swing.*;

public class QueueLC implements Queue {
    private Node head;
    private Node coda;
    private int counter;

    public QueueLC() {
        coda = null;
        head = null;
        counter = 0;
    }
    @Override
    public void enque(Object obj) {
        if(obj == null) throw new IllegalArgumentException("Obj is null");

        if(isEmpty()) {
            coda = new Node(obj);
            head = coda;
        }
        else {
            coda.setNext(new Node(obj));
            coda = coda.getNext();
        }
        counter++;
    }

    @Override
    public Object deque() {
        if(!isEmpty()) {
            Object tmp = head.getData();
            head = head.getNext();
            counter--;
            if(counter == 0)
                head = coda;
            return tmp;
        }
        else throw new ArrayIndexOutOfBoundsException("Queue is empty");
    }

    @Override
    public Object read() {
        if(!isEmpty())
            return head.getData();
        else throw new ArrayIndexOutOfBoundsException("Queue is empty");
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void flush() {
        coda = null;
        head = null;
        counter = 0;
    }

    @Override
    public int nElem() {
        return counter;
    }

    @Override
    public Object clone() {
        return null;
    }

    @Override
    public String toString()
    {
        return "\n\tQueueLC\nnElem: "+nElem()+"\n"+(head != null ? head:"");
    }
}
