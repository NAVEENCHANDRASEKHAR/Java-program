import java.util.*;
public class Flames
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String a = sc.nextLine();
        System.out.println("ENTER YOUR CRUSH NAME:");
        String b = sc.nextLine();
        a = a.toLowerCase().replaceAll(" ", "");
        b = b.toLowerCase().replaceAll(" ", "");
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);
        for (int i = 0; i < a1.length(); i++) 
        {
            char ch = a1.charAt(i);
            int index = b1.indexOf(String.valueOf(ch));
            if (index != -1) 
            {
                a1.deleteCharAt(i);
                b1.deleteCharAt(index);
                i--; 
            }
        }
        int count = a1.length() + b1.length();
        String flames = "FLAMES";
        StringBuilder sb = new StringBuilder(flames);
        int index = 0;
        while (sb.length() > 1)
         {
            index = (index + count - 1) % sb.length();
            sb.deleteCharAt(index);
        }
        char result = sb.charAt(0);
        switch (result)
         {
            case 'F':
                System.out.println("Relationship with your crush is Friends");
                break;
            case 'L':
                System.out.println("Relationship with your crush is Love");
                break;
            case 'A':
                System.out.println("Relationship with your crush is Affection with you");
                break;
            case 'M':
                System.out.println("Relationship with your crush is Marriage");
                break;
            case 'E':
                System.out.println("Relationship with your crush is Energetic partner");
                break;
            case 'S':
                System.out.println("Relationship with your crush is Sweet Heart");
                break;
        }
    }
}
