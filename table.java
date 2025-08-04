import java.util.Scanner;
class table 
{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]table = new int[n];
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+ " x 2 = "+i*2);
        }
    }    
}
