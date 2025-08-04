import java.util.Scanner;
class middlearray 
{
  public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[]array = new int[n];
    for(int i=0;i<n;i++)
    {
        array[i] = scan.nextInt();
    }
    int n2 = array[n/2];
    System.out.println(+n2);
  }  
}
