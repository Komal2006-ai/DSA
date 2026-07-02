//Find the smallest element in an array
import java.util.*;
class SmallestInArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemets: ");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(Arr[i] + " ");
        }
        int min = Arr[0];
        for(int i=1;i<n;i++)
        {
            if(Arr[i]<min)
            {
                min=Arr[i];
            }
        }
        System.out.println("The largest no in array is: "+ min);
    }
}