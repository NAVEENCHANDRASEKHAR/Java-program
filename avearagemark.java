import java.util.Scanner;
class avearagemark
 {
    public static void main(String[] args)
     {
        Scanner mark = new Scanner(System.in);
        int a = mark.nextInt();
        int b = mark.nextInt();
        int c = mark.nextInt();
        int d = mark.nextInt();
        int e = mark.nextInt();
        int total = a+b+c+d+e;
        int avg = total/5;
        System.out.println(avg);
        if(avg<35)
        {
            System.out.println("you need an extra classes");
        }
        else if(a>35)
        {
            System.out.println("you are excellent");
        }
        

    }
}
