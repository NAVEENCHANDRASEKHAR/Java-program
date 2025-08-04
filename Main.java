import java.util.Scanner;
public class Main
 {
	public static void main(String[] args)
	 {
		Scanner scan = new Scanner(System.in);
		System.out.println("Temparature in Celsius:");
		int a = scan.nextInt();
		float b = (float)(a*(9/5.0))+32;
		System.out.printf("Temparature in Fahrenheit is %.1fF\n",b);
	 }
 }
