import java.util.Scanner;
class CountDigit
{
    static void countdigit(int n)
    {
        while(n>0)
        {
            int lastdigit = n%10;
            System.out.println(lastdigit);
            n = n/10;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        countdigit(n);
    }
}