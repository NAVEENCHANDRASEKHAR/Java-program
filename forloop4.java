import java.util.Scanner;
class forloop4
{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a = scan.nextInt();
        System.out.println("enter the number 2");
        int b = scan.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
            {
            System.out.println(i);
            }
        }
    }
}