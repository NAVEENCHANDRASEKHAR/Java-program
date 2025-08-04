import java.util.Scanner;
public class star2
 {
    public static void main(String[] args)
     {
        Scanner star = new Scanner(System.in);
        int n = star.nextInt();
        for(int j=1;j<=n;j++)
        {
            for(int i=1;i<=j;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
