import java.util.Scanner;

/**
 * Created by Arabic on 13/10/10.
 */
public class Ch1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a []=new int[5];
        for (int i = 0; i <a.length ; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
