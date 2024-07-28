import java.util.Scanner;

public class MissingNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      int a[]={1,2,4,5};
      int n= a.length+1;
      int sum=(n*(n+1)/2);
      for(int i=0;i<a.length;i++)
      {
          sum=sum-a[i];
      }
        System.out.println("Missing Number is : "+sum);


    }

}
