package H.W3.src;

import java.util.Scanner;

/**
 * Created by MBH on 25/02/22.
 */
public class R6_4 {
    public static ArrayStack transfer(ArrayStack S,ArrayStack T)
    {
        while (S.isEmpty()!=true)
        {
            T.push(S.pop());
        }
        return T;
    }
    public static void main(String[] args) {
        ArrayStack<Integer> M =new ArrayStack<>(6);
        ArrayStack<Integer> V =new ArrayStack<>(6);
        Scanner in =new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            M.push(in.nextInt());
            System.out.println("M Top = "+M.top());
        }
        System.out.println();
        V=transfer(M,V);
        for (int i = 0; i < 6; i++) {
            System.out.print("V Top = "+V.top());
            V.pop();
            System.out.println();

        }

    }
}

