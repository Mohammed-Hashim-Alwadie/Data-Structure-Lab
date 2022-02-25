package H.W3.src;



/**
 * Created by MBH on 25/02/22.
 */
public class ArrayStack<E>  implements Stack<E> {
    E data[];
    int t=-1;

    static final int CAPACITY=200;

    public ArrayStack(int B) {
        data=(E[])new Object[B];

    }
    public ArrayStack()
    {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            throw new IllegalStateException("Stack is full");
        data[++t]=element;
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E x=data[t];
        data[t]=null;
        t--;
        return x;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }
}

