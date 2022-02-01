/**
 * Created by Arabic on 31/01/22.
 */
public class ArrayQueue<E> implements Queue<E> {

final static int CAPASITY =100;
    E[] data ;
   private int f=0;
    private int sz=0;


    public ArrayQueue(int c) {
        data=(E[])new Object[c];

    }

    public ArrayQueue() {
        this(CAPASITY);
    }

    @Override
    public boolean isEmpty() {return sz==0;}

    @Override
    public int size() {return sz;}

    @Override
    public void enqueue(E element) {
        if (size()==data.length)
       throw new IllegalStateException("queue is full");
        int x=(f+sz)%data.length;
        data [x]=element;
        sz++;
    }

    @Override
    public E dequeue()
    {
        if (isEmpty())return null;
        E deleted = data[f];
        data[f]=null;
        int x=(f+1)%data.length;
        sz--;
        return deleted;
    }

    @Override
    public E first() {
        if (isEmpty())return null;
        return data[f];
    }
}
