import java.util.Scanner;
class score3 
{
 public static void main(String[] args) 
 {
    Scanner num = new Scanner(System.in);
    int a = num.nextInt();
    if(a<50)
    {
        System.out.println("you need to improve");
    }
    else if(a==50 || a>50 && a<70)
    {
        System.out.println("good job");
    }
    else if(a>70)
    {
        System.out.println("excellent");
    }
 }   
}
