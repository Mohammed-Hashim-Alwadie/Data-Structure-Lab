package H.W3.src;

import java.util.Scanner;

/**
 * Created by MBH on 25/02/22.
 */
public class R6_5 {
    public static ArrayStack remov(ArrayStack M)
    {
        while (M.isEmpty()!=true)
        {
            M.pop();
        }
        return M;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayStack<Integer> s=new ArrayStack<>(6);
        for (int i = 0; i < 6; i++) {
            s.push(in.nextInt());
        }
        System.out.println("is Empty after "+s.isEmpty());

        System.out.println("is Empty befor "+s.isEmpty());
        s=remov(s);


    }

}
