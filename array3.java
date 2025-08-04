import java.util.Scanner;
class array3
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
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += mark[i];
        }
        System.out.println(+ sum);
        int average = sum / n; 
        System.out.println(+ average);
    }    
}

