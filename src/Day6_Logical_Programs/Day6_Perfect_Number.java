package Day6_Logical_Programs;
import java.util.Scanner;

public class Day6_Perfect_Number 
{
    static boolean Perfect(int n)
    {
        if (n == 1)
            return false;
        int sum = 1;
  
        for (int i = 2; i * i <= n; i++) 
        {
            
            if (n % i == 0) {
                                
                if (i * i == n)
                    sum += i;
                else
                    sum += i + (n / i);
            }
        }
       
        if (sum == n)
            
            return true;
  
        return false;
    }
  
    public static void main(String[] args)
    {
    	System.out.println("enter the number to cheack perfect or not");
    	Scanner sc=new Scanner(System.in);
    	
        int n = sc.nextInt();
        
        if (Perfect(n))
            
            System.out.println(n + " is a perfect number");
        
        else
            System.out.println( n + " is not a perfect number");
    }


}
