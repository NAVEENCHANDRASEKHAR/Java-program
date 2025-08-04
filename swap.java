import java.util.Scanner;
class swap 
{
   public static void main(String[] args) 
   {
    Scanner scan = new Scanner(System.in);
    System.out.println("before swap");
    int a = scan.nextInt();
    int b = scan.nextInt();
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("after swap");
    System.out.println(+a);
    System.out.println(+b);
   } 
}
