import java.util.*;
public class Converlowtohigh
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char a1[] = a.toCharArray();
        for(int i=0;i<a1.length;i++)
        {
            char ch = a1[i];
            if(Character.isUpperCase(ch))
            {
                System.out.print(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                System.out.print(Character.toUpperCase(ch));
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
