import java.util.Scanner;
public class Switch {
	public static void main (String []args) {
		int choice,amount;
		
		System.out.println("enter option:1->INR->USD ");
		System.out.println("enter option:2->USD->INR ");
		Scanner in=new Scanner(System.in);
		choice =in.nextInt();
		System.out.println("enter the amount($): ");
		amount =in.nextInt();
		
		if(choice==1)
		{
			System.out.println("total"+(amount*72));
		}
		else if(choice==2)
		{
		 System.out.println("total="+(amount/72));	
	    }
		else {
			System.out.println("error");
		}
	}
}
