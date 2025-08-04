import java.util.Scanner;
class array2
{
    public static void main(String[] args)
     {
        int[]mark = new int[5];
        Scanner scan = new Scanner(System.in);
        mark[0] = scan.nextInt();
        mark[1] = scan.nextInt();
        mark[2] = scan.nextInt();
        mark[3] = scan.nextInt();
        mark[4] = scan.nextInt();
        int total = mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
        System.out.println(total);
        int average = total/5;
        System.out.println(average);
    }
}
