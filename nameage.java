import java.util.Scanner;
class nameage
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("My Name is "+name);
        System.out.println("My age is "+age);
    }
}
