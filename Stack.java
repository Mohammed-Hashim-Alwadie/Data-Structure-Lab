package H.W3.src;

/**
 * Created by MBH on 25/02/22.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}

