/**
 * Created by MBH on 01/02/22.
 */
public class A__2 {
    public static void main(String[] args) {
        int a[] = { 5,6,7,4,2 };
        int b[] = new int[a.length];
        b=a;
        b[0]++;
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
