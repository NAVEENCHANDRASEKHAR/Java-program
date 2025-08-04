import java.util.Scanner;
class trafficlight
 {
    public static void main(String[] args) 
    {
        Scanner light = new Scanner(System.in);
        String a = light.nextLine();
        if(a.equals("red"))
         {
            System.out.println("Stop");
        }
        else if(a.equals("yellow")) 
        {
            System.out.println("get ready"); 
        }
        else if(a.equals("green"))
         {
            System.out.println("go");
        }
    }
}


    

