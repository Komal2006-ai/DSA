//Check if an array is sorted
import java.util.Scanner;
class SortCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean isSorted = true;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
