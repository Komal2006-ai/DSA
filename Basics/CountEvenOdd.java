//Count even and odd numbers
import java.util.Scanner;
class CountEvenOdd
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
        int EvenCounter = 0;
        int OddCounter = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                EvenCounter++;
            }
            else
            {
                OddCounter++;
            }
        }
        System.out.println("Total Even numbers: " + EvenCounter);
        System.out.println("Total Odd numbers: "+ OddCounter);
    }
}