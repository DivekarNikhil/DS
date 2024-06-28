import java.util.Scanner;

public class AddElemenetInArray
{

    public static void main(String[] args)
    {
        int  n;
        int a[];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        n=s.nextInt();
        a=new int[n];
        int b[]=new int[n+1];
        System.out.println("Enter the Element");

        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(" Enter index where you add element");
        int id=s.nextInt();
        System.out.println("Add new element");
        int ed=s.nextInt();

        for(int i=0;i<n+1;i++ )
        {
            if(i<id)
            {
                b[i]=a[i];
            }
           else if (i==id)
            {
                b[i]=ed;

            }
           else
            {
             b[i]=a[i-1]  ;


            }


        }
        System.out.println("Element is");
        for(int i=0;i<n+1;i++)
        {
            System.out.println(b[i]);
        }

    }
}
