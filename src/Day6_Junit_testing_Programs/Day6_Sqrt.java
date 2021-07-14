package Day6_Junit_testing_Programs;

public class Day6_Sqrt
{
	public static void main(String[] args) 
	{
		
    System.out.println("Enter number: ");
    double c = Double.parseDouble(args[0]);
   // int Y = Integer.parseInt(args[0]);


    double t = c;

    double epsilon = 1e-15;


    while ( Math.abs(t - c / t) > epsilon * t)
    {
        t = ((c / t) + t) / 2;

    }

    System.out.println("Square Root is "+t);
}



}
