import java.util.Scanner;
class reverseforloop
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=n;i>=1;i=i-1)
        {
            System.out.println(i);
        }
    }
}
