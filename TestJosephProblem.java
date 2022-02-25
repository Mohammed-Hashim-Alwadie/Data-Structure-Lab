package H.W4;

import java.util.Scanner;

/**
 * Created by MBH on 25/02/22.
 */
public class TestJosephProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        JosephuseProblem joseph=new JosephuseProblem();
        int peopel,positon;
        System.out.println("Enter the number of people ");
        peopel=in.nextInt();
        System.out.println("Enter the number of jumb");
        positon=in.nextInt();
        joseph.Circle(peopel,positon);

    }
}

