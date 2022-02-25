package H.W4;

/**
 * Created by MBH on 25/02/22.
 */
public class CicleQueue<E> implements Queue<E> {


    final static int CAPACITY=200;
    E [] data;
    private int g=0;
    private int sz=0;
    public CicleQueue( int c) {
        data= (E[]) new Object[c];
    }
    public CicleQueue(){
        this(CAPACITY);

    }


    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
        if (size()== data.length)
            throw new IllegalStateException("Queue is full");
        int x =(sz+g)% data.length;
        data[x]=element;
        sz++;

    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E delete=data[g];
        data[g]=null;
        sz--;
        g=(g+1)% data.length;
        return delete;
    }

    @Override
    public void rotet() {
        enqueue(dequeue());
    }

    @Override
    public E first() {
        if (isEmpty())
            return null;
        return data[g];
    }
}







