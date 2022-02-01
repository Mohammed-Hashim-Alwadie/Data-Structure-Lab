/**
 * Created by LAB on 10/13/2010.
 */
public class ArrayStack<E> implements Stack<E> {

    E data[];
    int t=-1;
    static final int CAPACTTY=100;

    public ArrayStack(int c){
        data=(E[])new Object[c];
    }

    public ArrayStack()
    {
        this(CAPACTTY);
    }


    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            throw new IllegalStateException("stack is full");
        data[++t]=element;

    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E pop() {
        if(isEmpty())return null;
        E x=data[t];
        data[t]=null;
        t--;
        return x;
    }

    @Override
    public E top() {
      if (isEmpty()) return null;
        return data[t];
    }
}
