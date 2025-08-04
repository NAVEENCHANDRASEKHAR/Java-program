import java.util.Scanner;
class div3div5
{
    public static void main(String[] args)
     {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if(a%5==0 && a%3==0)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}