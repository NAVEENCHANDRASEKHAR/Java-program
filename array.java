import java.util.Scanner;
class array 
{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        String[]playlist = new String[3];
        playlist[0] = a;
        System.out.println(playlist[0]);
        playlist[1] = b;
        System.out.println(playlist[1]);
        playlist[2] = c;
        System.out.println(playlist[2]);
    }    
}
