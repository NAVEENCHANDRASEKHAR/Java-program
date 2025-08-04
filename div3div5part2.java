import java.util.Scanner;
class div3div5part2 
{
    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int a = scan.nextInt();
 int count = 0;
 for(int i=1;i<=a;i++)
 {
    if(i%3==0 && i%5==0)
    {
        count = count+1;
        System.out.println(i);
    }
 }
 System.out.println("count is : "+count);
}
}

