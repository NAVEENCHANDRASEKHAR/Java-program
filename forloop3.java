import java.util.Scanner;
public class forloop3
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a = scan.nextInt();
        System.out.println("enter the number 2");
        int b = scan.nextInt();
        System.out.println("the numbers are");
        for(int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}
