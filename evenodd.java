import java.util.Scanner;
class evenodd 
{
    public static void main(String[] args)
     {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if(a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
