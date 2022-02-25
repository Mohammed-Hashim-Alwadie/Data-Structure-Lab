import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Arabic on 16/02/22.
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String>list= new SinglyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first\t2 add last \n3 remove first\t 0 exit");
                while(choice!=0)
                {
                    System.out.print("your choice:");
                    choice=in.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.print("input name:");
                            list.addFirst(in.next());
                            break;
                        case 2:
                            System.out.print("input name:");
                            list.addLast(in.next());
                            break;
                        case 3:
                            System.out.println("deleted is "+list.removeFirst());;
                            break;
                        case 0:
                            System.exit(0);

                    }
                    System.out.println("first= "+list.first()+"\tlast= "+list.last()+"\tsize= "+list.size());
                }
    }
}
