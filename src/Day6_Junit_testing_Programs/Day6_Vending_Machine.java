package Day6_Junit_testing_Programs;
import java.util.Scanner;
public class Day6_Vending_Machine
{

	public static void main(String[] args)
	{
		int note;
		int [] VmachineNotes= {1,2,5,10,20,50,100,500,1000};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the money");
		double money=sc.nextInt();
		int minnotes=0;
		for(int i=7;i>=0;i--)
		{
			if(money>=VmachineNotes[i])
			{
				note=(int) (money/VmachineNotes[i]);
				money=money-note*VmachineNotes[i];
				minnotes=minnotes+note;
				System.out.println("note:"+VmachineNotes[i]+" number or of notes "+note);
			}
		}
		System.out.println("total number of notes "+minnotes);
		
	}

}
