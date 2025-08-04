import java.util.Scanner;
public class dowhile 
{
  public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    do
    {
        System.out.println("Enter the number > 10 :");
        n = scan.nextInt();   
    }while(n<10);
}
}


