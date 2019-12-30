package NewProgramme;
import java.util.Scanner;

public class Programme1 {
	public static void main (String []args)  {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		while(num >0)
		{
			n=num%10;
			if(n%2!=0)
			{
				sum=sum+n;
				
				
			}
			num=num/10;
			
		}
		System.out.println("addittion of odd numbers is"+sum);
			}
	
	

}
