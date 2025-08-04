import java.util.Scanner;
public class forloop5
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int oddcount = 0;
        for(int i=0;i<=a;i++)
        {
            if(i%2==0)
            {

            }
            else
            {
                oddcount = oddcount+1;
            }
        }
          System.out.println(oddcount);
    }
}
