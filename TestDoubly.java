import java.util.Scanner;

/**
 * Created by Arabic on 28/02/22.
 */
public class TestDoubly {
    public static void main(String[] args) {
        DoublyLinkedList<String>list= new DoublyLinkedList<>();
        Scanner in= new Scanner(System.in);
        System.out.println("1 add first\t2 add last\t3 remove first" +
                "\t4 remove last \t0 exit");
        int choice=-1;
        while (choice!=0)
        {
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 0:
                    System.exit(0);
                    break;
                case  1:

                System.out.println("input name");
                list.addFirst(in.next());
                break;
                case  2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    break;
                case  3:
                    System.out.println("removed is :"+list.removeFirst());
                    break;
                case  4:
                    System.out.println("removed is :"+list.removeLast());
                    break;
        }
            System.out.println("first= "+list.first()+"\t last= "+list.last()+"\t size= "+list.size());
    }
}}
