package Stack;
import nodo.Node;

public class StackLC implements Stack {
    private Node head;
    private int counter;

    public StackLC() {
        head = null;
        counter = 0;
    }

    //public StackLC(StackLC stack) {}

    @Override
    public void push(Object obj) {
        if(!(obj == null)) {
            head = new Node(head, obj);
            counter++;
        }
    }

    @Override
    public Object pop() {
        if(!isEmpty()) {
            Object tmp = head.getData();
            head = head.getNext();
            counter--;
            return tmp;

        }
        else throw new ArrayIndexOutOfBoundsException("Stack is empty");

    }

    @Override
    public Object top() {
        return head.getData();
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
    public int nElem() {
        return counter;
    }

    @Override
    public void flush() {
        head = null;
        counter = 0;
    }

    //     public Object clone()
    //    {
    //        return ObjectCloner.ObjdeepCopy(this);
    //    }

    @Override
    public String toString()
    {
        return "\tStackV\nnElem: "+nElem()+"\n"+(head != null ? head:"");
    }

}
