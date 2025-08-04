import java.util.Scanner;
class ene 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a==b)
        {
            System.out.println("Both the numbers are equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}
