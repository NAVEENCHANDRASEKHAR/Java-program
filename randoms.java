import java.util.Random;
public class randoms 
{
  public static void main(String[] args)
   {
    Random scan = new Random();
    int n = 0;
    while(n!=6)
    {
        n = scan.nextInt(12);
        System.out.println(n);
    }
  }  
}
