/**
 * Created by MBH on 25/02/22.
 */
public class TestQueue {
    public static void main(String[] args) {
        Linkage<Character> q=new LinkedQueue<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("THe queue is Empty "+q.isEmpty());
        System.out.println("Pleas Enter the queue element ");
        for (int i = 0; i < 5; i++) {
            q.enqueue(scanner.next().charAt(0));
            System.out.println("first element is " +q.first());
            System.out.println("Size = "+q.Size());
        }
        while(!q.isEmpty())
        {
            System.out.print(q.dequeue()+"\t");
        }
    }

}