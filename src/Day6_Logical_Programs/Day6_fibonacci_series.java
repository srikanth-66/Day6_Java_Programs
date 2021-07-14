package Day6_Logical_Programs;
import java.util.Scanner;

public class Day6_fibonacci_series
{
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;
          while (counter < N) 
          {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
  
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number you wanted fibonacci series");
    	int n=sc.nextInt();
          Fibonacci(n);
    }


}
