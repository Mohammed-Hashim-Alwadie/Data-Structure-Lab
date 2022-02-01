import java.util.Scanner;

/**
 * Created by LAB on 10/13/2010.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer>mystack=new ArrayStack<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("is the stack empty?"+mystack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i <5 ; i++) {
            mystack.push(in.nextInt());
            System.out.println("top element is ="+mystack.isEmpty());
            System.out.println("stack size is ="+mystack.isEmpty());
            System.out.println("is the stack empty?"+mystack.isEmpty());
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("deleted element is ="+mystack.pop());
            System.out.println("top element after delete is ="+mystack.top());
            System.out.println("stack size is ="+mystack.size());
            System.out.println("is the stack empty?"+mystack.isEmpty());
        }
    }
}
