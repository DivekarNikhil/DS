import java.util.Scanner;

public class Array {

    public static void main(String[] args)
    {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Array Size");
        n=s.nextInt();
      int  a[]=new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Element is :");
        for (int i=0;i<n;i++)
        {
            System.out.print(   a[i] + " " );
        }

    }
}
