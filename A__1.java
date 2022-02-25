/**
 * Created by MBH on 01/02/22.
 */
public class A__1 {
    public static void main(String[] args) {
        int [] intArray = {10,20,30,40,50,60,70};
        System.out.println(" Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();
        System.out.println("Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}
