/**
 * Created by Arabic on 31/01/22.
 */
public interface Queue<E> {
    boolean isEmpty();
            int size();
                void enqueue(E element);
    E dequeue();
    E first();
}
