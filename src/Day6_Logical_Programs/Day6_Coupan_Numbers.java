package Day6_Logical_Programs;
import java.util.Scanner;
import java.lang.*;
public class Day6_Coupan_Numbers 
{
	public static void main(String[] args)
	{
		
	int dist=1,count=0;
	System.out.println("enter the total number of coupans");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int [] col=new int[num];
	while(dist<=num)
	{
		int val=(int)(Math.random()*num);
		count++;
		System.out.println("the random value is"+(val+1));
		if(col[val]!=val+1)
		{
			dist++;
			col[val]=val+1;
		}
		
	}
	System.out.println("total no.of trials to get"+num+"diff coupan numbers are"+count);
	System.out.println(" ");
	System.out.println("Array:");
	for(int i=0;i<num;i++)
	{
		System.out.println("elements in the Array is"+col[i]);

		
	}
	}
}
