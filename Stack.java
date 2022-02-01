/**
 * Created by LAB on 10/13/2010.
 */
public interface Stack<E> {
    boolean isEmpty();
    void push(E element);
    int size();
    E pop();
    E top();

}
