package H.W3.src;

import java.util.Scanner;

/**
 * Created by MBH on 25/02/22.
 */
public class R6_35 {
    static boolean isOperatot(char operant)
    {
        if(operant == '*' || operant == '/' || operant == '+' || operant == '-')
            return true;

        return false;
    }

    static int evaluatePostfix(String postfix)
    {
        ArrayStack<Integer> postFix = new ArrayStack<>();
        int n = postfix.length();

        for(int i=0;i<n;i++)
        {
            if(isOperatot(postfix.charAt(i)))
            {
                int op1 = postFix.pop();
                int op2 = postFix.pop();

                switch(postfix.charAt(i))
                {
                    case '*': postFix.push(op2 + op1);break;
                    case '/': postFix.push(op2 - op1);break;
                    case '-': postFix.push(op2 * op1);break;
                    case '+': postFix.push(op2 / op1);break;
                }

            }
            else
            {
                int operand = postfix.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        return postFix.pop();
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String postfix = "24+441+*-";
        System.out.println("Enter the Expression ");
        postfix =in.next();
        System.out.print("the Given Expression "+ postfix +" = : ");
        System.out.println(evaluatePostfix(postfix));
    }

}
