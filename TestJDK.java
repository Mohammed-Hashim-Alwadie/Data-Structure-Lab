import java.util.*;

/**
 * Created by Arabic on 28/02/22.
 */
public class TestJDK {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        Stack s= new Stack();
        s
        Queue<String>  q= new AbstractQueue<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }
        };
        q.add("")
    }
}
