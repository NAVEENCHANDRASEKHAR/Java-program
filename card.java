import java.util.Scanner;
public class card 
{
   public static void main(String[]args)
   {
    Scanner scan = new Scanner(System.in);
    char a = scan.next().charAt(0);
    int a1 = scan.nextInt();
    char b = scan.next().charAt(0);
    int b1 = scan.nextInt();
    char c = scan.next().charAt(0);
    int c1 = scan.nextInt();
    if(a==b && b==c && a1==b1 && b1==c1)
    {
        System.out.println("double bonanza");
    }
    else if(a==b && b==c || a1==b1 && b1==c1)
    {
        System.out.println("bonanza");
    }
    else
    {
        System.out.println("no bonanza");
    }
   } 
}
