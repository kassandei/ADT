package Queue;

import objectcloner.ObjectCloner;

public class QueueV implements Queue {
    Object[] vettore;
    public static int DEF_MAX_ELEM = 10;
    protected int coda;

    public QueueV(int maxElem) {
        vettore = new Object[maxElem];
        coda = 0;
    }

    public QueueV() {
        this(DEF_MAX_ELEM);
    }

    public QueueV(QueueV queue) {
        QueueV tmp = (QueueV) queue.clone();
        coda = tmp.coda;
    }

    private void compress() {
        for(int i = 1; i < coda; i++)
            vettore[i-1] = vettore[i];
        coda--;
    }

    @Override
    public void enque(Object obj) {
        if(!(isFull() || obj == null))
            vettore[coda++] = obj;
        else throw new ArrayIndexOutOfBoundsException("Queue is full");
    }

    @Override
    public Object deque() {
        if(!isEmpty()) {
            Object tmp = vettore[0];
            compress();
            return tmp;
        }
        else throw new ArrayIndexOutOfBoundsException("Queue empty");
    }

    @Override
    public Object read() {
        if(!isEmpty())
            return vettore[0];
        else throw new ArrayIndexOutOfBoundsException("Queue empty");
    }

    @Override
    public boolean isEmpty() {
        return coda == 0;
    }

    @Override
    public boolean isFull() {
        return coda == vettore.length;
    }

    @Override
    public void flush() {
        coda = 0;
    }

    @Override
    public int nElem() {
        return coda;
    }

    @Override
    public Object clone() {
        return ObjectCloner.ObjdeepCopy(this);
    }
    @Override
    public String toString()
    {
        String str = "\tQueueV\nnElem: "+nElem()+"\nmaxElem: "+vettore.length;
        for(int i=0; i<nElem(); i++)
            str += "\n"+i+":\t"+vettore[i];
        return str + "\n";
    }
}
