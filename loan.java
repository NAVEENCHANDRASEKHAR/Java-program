import java.util.Scanner;
class loan {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);            
        System.out.println("Enter your salary:");
        int salary = scan.nextInt();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        if(salary >= 20000 && age <= 25) 
        {
            System.out.println("Enter the loan amount you need:");
            int loan = scan.nextInt();
            System.out.println("Eligible for loan.");

            if(loan <= 50000)
             {
                System.out.println("Loan is available.");
            } 
            else 
            {
                System.out.println("Loan amount too high — not available.");
            }
        } 
    }
}

