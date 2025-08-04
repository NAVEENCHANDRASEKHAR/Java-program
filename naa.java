import java.util.Scanner;
class naa
 {
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String myplace = scan.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My native is "+myplace);      
    }
}
