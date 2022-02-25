/**
 * Created by Arabic on 21/02/22.
 */
public class LinkedQueue<E>implements Queue<E> {
    SinglyLinkedList<E>l= new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public void enqueue(E el) {
l.addLast(el);
    }

    @Override
    public E first() {
        return l.first();
    }

    @Override
    public E dequeue() {
        return l.removeFirst();
    }
}
