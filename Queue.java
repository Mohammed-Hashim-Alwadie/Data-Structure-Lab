package H.W4;

/**
 * Created by MBH on 25/02/22.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E e);
    E first();
    E dequeue();
    void rotet();
}

