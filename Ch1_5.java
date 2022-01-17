import java.util.Scanner;

/**
 * Created by Arabic on 13/10/10.
 */
public class Ch1_5 {
    public static void output_Ch1_5(int []x)
    {
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);

        }

    }

        public static void main(String[] args) {
            int a []=new int[5];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i <a.length ; i++) {
                a[i]=input.nextInt();
            }
            output_Ch1_5(a);

        }
    }



