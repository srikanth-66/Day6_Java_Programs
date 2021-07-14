package Day6_Junit_testing_Programs;
import java.util.Scanner;

public class Day6_Day_Of_Week
{
	   public static void main(String[] args) 
	   {
		               int m, d, y;
		               Scanner sc=new Scanner(System.in);

		               System.out.println("Enter month (1 for January,2 for February, 3 for March and so forth.): ");
		               m = sc.nextInt();
		               System.out.println("Enter day: ");
		               d = sc.nextInt();
		               System.out.println("Enter year in yyyy format: ");
		               y = sc.nextInt();


		               int y0 = y - (14 - m) / 12;
		               int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		               int m0 = m + 12 * ((14 - m) / 12) - 2;
		               int d0 = (d + x + 31 * m0 / 12) % 7;

		               System.out.println("Sunday is 0, Monday is 1, Tuesday is 2, Wednesday is 3, Thursday is 4, and Friday is 5 and Saturday is 6");
		               System.out.println("It was: "+d0);


		           
		   }

	   }




