import java.util.Scanner;
class kfc {
    public static void main(String[] args) {
        Scanner eat = new Scanner(System.in);
        String a = eat.nextLine();
        String b = eat.nextLine();
        String c = eat.nextLine();

        if(a.equals("kfc")) {
            System.out.println("ENTER INTO RESTAURANT");

            if(b.equals("chicken")) {
                System.out.println("EAT THE CHICKEN");

                if(c.equals("pepsi")) {
                    System.out.println("DRINK THE PEPSI");
                }
            }
        } else {
            System.out.println("GO TO NEXT RESTAURANT");
        }
    }
}
