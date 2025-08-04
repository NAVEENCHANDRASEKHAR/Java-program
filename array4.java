import java.util.Scanner;
class array4
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  
        int[] mark = new int[n];  
        for (int i = 0; i < n; i++) 
        {
            mark[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++)
         {
            System.out.println(mark[i]);  
        }
    }
}
