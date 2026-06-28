import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int Arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            Arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(Arr[i] + " ");
        }
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(Arr[j]<Arr[min])
                {
                    min=j;
                }
            }
            int temp = Arr[min];
            Arr[min] = Arr[i];
            Arr[i] = temp;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(Arr[i] + " ");
        }
    }
  
}