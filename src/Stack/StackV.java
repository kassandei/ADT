package Stack;

public class StackV implements Stack {

    private Object[] vettore;
    private static int DEF_MAX_ELEM = 12;
    private int head;

    public StackV(int maxElem) {
        vettore = new Object[maxElem];
        head = 0;
    }

    public StackV() {
        this(DEF_MAX_ELEM);
    }

    @Override
    public void push(Object obj) {
        if(!(isFull() || obj == null))
            vettore[head++] = obj;
        else
            throw new ArrayIndexOutOfBoundsException("Array is full!");
    }

    @Override
    public Object pop() {
        if(!isEmpty())
            return vettore[--head];
        else
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
    }

    @Override
    public Object top() {
        if(!isEmpty())
            return vettore[head-1];
        else
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
    }

    @Override
    public boolean isEmpty() {
        return head == 0;
    }

    @Override
    public boolean isFull() {
        return head == vettore.length;
    }

    @Override
    public int nElem() {
        return head;
    }

    @Override
    public void flush() {
        head = 0;
    }

    @Override
    public String toString()
    {
        String str = "StackV\nnElem: "+nElem()+"\nmaxElem: "+vettore.length;
        for(int i=0; i<nElem(); i++)
            str += "\n"+i+":\t"+vettore[i];
        return str + "\n";
    }
}
