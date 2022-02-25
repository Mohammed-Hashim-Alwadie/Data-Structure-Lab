/**
 * Created by Arabic on 21/02/22.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E el);
    E pop();
}
