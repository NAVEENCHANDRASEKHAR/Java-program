import java.util.Scanner;
class score2 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        int a = score.nextInt();
        if(a >= 36 && a <= 60)
         {
            System.out.println("dairymilk chocolate");
        }
        else if(a > 60 && a <= 89)
         {
            System.out.println("15 roses");
        }
        else if(a >= 90 && a <= 99) 
        {
            System.out.println("silver ring");
        }
        else
         {
            System.out.println("no gift");
        }
    }
}

