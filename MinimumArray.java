public class MinimumArray {

    public static void main(String[] args) {

        int arr[] = {12, 45, 30, 26, 51, 27};
        //   int max=arr[0];
        int temp = 0;
        for (int i = 0; i <= arr.length ; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}