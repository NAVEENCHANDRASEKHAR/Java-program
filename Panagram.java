import java.util.*;
public class Panagram
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        Set<Character> s = new HashSet<>();
        for(char ch='a';ch<='z';ch++)
        {
            s.add(ch);
        }
        for(int i=0;i<a.length();i++)
        {
            char c = a.charAt(i);
            s.remove(c);
        }
        if(s.isEmpty())
        {
            System.out.println("Panagram");
        }
        else
        {
            System.out.println("Not a Panagram");
        }
    }
}