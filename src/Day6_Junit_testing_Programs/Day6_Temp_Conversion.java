package Day6_Junit_testing_Programs;

public class Day6_Temp_Conversion 
{
	public static void main(String[] args) 
	{
		
		int check1, celsius, fahrenheit;
		System.out.println("Enter 1 to convert Celsius to Fahrenheit and " + "Enter 2 to convert Fahrenheit to Celsius: ");
		check1 = Integer.parseInt(args[0]);

    if (check1 == 1)
    {
        System.out.println("Enter temperature in °C: ");
        celsius = Integer.parseInt(args[1]);
        int fahrenheitC = (celsius * 9 / 5) + 32;
        System.out.println(+celsius + "°C = " + fahrenheitC + "°F");
    }
    else if (check1 == 2)
    {
        System.out.println("Enter temperature in °F: ");
        fahrenheit = Integer.parseInt(args[2]);
        int celsiusF = (fahrenheit - 32) * 5 / 9;
        System.out.println(+fahrenheit+"°F = "+celsiusF+ "°C");
    }
    else
    {
        System.out.println("Enter valid input.");
    }
}


}
