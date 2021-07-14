package Day6_Logical_Programs;
import java.util.Scanner;
public class Day6_Reverse_number
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number to reversed");
		Scanner sc=new Scanner(System.in);
		
		int num =sc.nextInt();
		System.out.println("the entered number is:"+num);
		int reversed = 0;

	    while(num != 0)
	    {
	        int digit = num % 10;
	        reversed = reversed * 10 + digit;

	        num /= 10;
	}
		System.out.println("Reversed Number: " + reversed);

	}
}
