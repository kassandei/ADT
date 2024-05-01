package Queue;

public class QueueVC extends QueueV implements Queue {
    Object[] vettore;
    public static int DEF_MAX_ELEM = 10;
    private int head;
    private int coda;

    public QueueVC(int maxElem) {
        vettore = new Object[maxElem];
        head = -1;
        coda = 0;
    }

    public QueueVC() {
        this(DEF_MAX_ELEM);
    }

    public QueueVC(QueueVC a) {

    }

    @Override
    public void enque(Object obj) {
        if(obj == null) throw new IllegalArgumentException("Obj is null");
        if(isFull()) throw new ArrayIndexOutOfBoundsException("Queue is full");
        if(isEmpty()) head = coda;
        vettore[coda] = obj;
        coda = inc(coda);
    }

    @Override
    public Object deque() {
        Object tmp;
        if(!isEmpty()) {
            tmp = vettore[head];
            head = inc(head);
            if(isFull())
                head = -1;
            return tmp;
        } else throw new ArrayIndexOutOfBoundsException("Queue is empty");
    }

    @Override
    public Object read() {
        if(!isEmpty())
            return vettore[head];
        else throw new ArrayIndexOutOfBoundsException("Queue is empty");
    }

    @Override
    public boolean isEmpty() {
        return head == -1;
    }

    @Override
    public boolean isFull() {
        return head == coda;
    }

    @Override
    public void flush() {
        coda = 0;
        head = -1;
    }

    @Override
    public int nElem() {
        return (coda+vettore.length-head)%(vettore.length);
    }

    @Override
    public String toString() {
        String str = "\tQueueVC\nnElem: "+nElem()+"\nmaxElem: "+(vettore.length-1);
        for(int i=0; i<nElem(); i=inc(i))
            str += "\n"+i+":\t"+vettore[i+head];
        return str;
    }

    private int inc(int n)
    {
        return (n+1)%vettore.length;
    }
}
