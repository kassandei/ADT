package List;

import nodo.Node;
import objectcloner.ObjectCloner;


public class ListLC implements List {

    protected Node head;
    protected Node cursore;

    protected int counter;

    public ListLC() {
        head = new Node("Dummy");
        cursore = null;
        counter = 0;
    }

    public ListLC(ListLC list) {
        ListLC tmp = (ListLC) list.clone();
        head = tmp.head;
        cursore = tmp.cursore;
        counter = tmp.counter;
    }
    @Override
    public Object read() {
        if(isEmpty())
            return null;
        else if (cursore == null)
            return head.getData();
        else
            return cursore.getNext().getData();
    }

    @Override
    public void flush() {
        head.setNext(null);
        cursore = null;
        counter = 0;
    }

    @Override
    public boolean insert(Object obj) {
        if(obj == null || isFull())
            return false;
        else if (cursore == null) {
            Node tmp = new Node(head.getNext(),obj);
            head.setNext(tmp);
        }
        else {
            Node tmp = new Node(cursore.getNext().getNext(),obj);
            cursore.getNext().setNext(tmp);
        }
        counter++;
        return true;
    }

    @Override
    public Object extract() {
        if(isEmpty() || cursore == null)
            return null;
        else {
            Object tmp = cursore.getNext().getData();
            cursore.setNext(cursore.getNext().getNext());
            counter--;
            return tmp;
        }

    }
    @Override
    public int nElem() {
        return counter;
    }

    @Override
    public void reset() {
        cursore = null;
    }

    @Override
    public boolean moveNext() {
        if((cursore != null && cursore.getNext().getNext() == null) || isEmpty())
            return false;
        else if(cursore == null)
            cursore = head;
        else
            cursore = cursore.getNext();
        return true;
    }

    @Override
    public boolean hasNext() {
        return cursore.getNext() != null;
    }

    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public boolean isFull() {
        return false; // Assuming it can never be full
    }

    @Override
    public boolean seek(int position) {
        if(position < 0 || position > nElem())
            return false;
        else {
            reset();
            for(int i = 0; i == position; i++) {
                moveNext();
            }
            return true;
        }
    }

    @Override
    public int peek() {
        if(cursore == null)
            return 0;
        else {
            int position = 0;
            Node tmp = head;
            while(tmp != cursore) {
                tmp = tmp.getNext();
                position++;
            }
            return position;
        }
    }

    @Override
    public Object clone() {
        return ObjectCloner.ObjdeepCopy(this);
    }

    @Override
    public String toString() {
        return "\n\tListLC\nnElem: " + nElem() + "\n" + (head.getNext() != null ? head.getNext() : "Empty List");
    }
}
