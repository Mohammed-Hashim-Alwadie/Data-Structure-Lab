/**
 * Created by Arabic on 21/02/22.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E el);
    E first();
    E dequeue();
}
