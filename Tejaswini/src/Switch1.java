import java.util.Scanner;
public class Switch1 {
	public static void main (String []args) {
		float inr,usd;
		int choice;
		System.out.println("enter option:1->INR->USD ");
		System.out.println("enter option:2->usd->inr ");
		Scanner in=new Scanner(System.in);
		choice=in.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter");
			inr=in.nextFloat();
			usd=inr*(1.0f/71.0f);
			System.out.printf("amount="+inr+"=$ %.2f",usd);
		break;
		case 2:
			System.out.println("enter");
			usd=in.nextFloat();
			inr=usd*71.0f;
			System.out.printf("amount="+inr);	
			break;
			default:
				System.out.println("-");	
			break;
		}

}
}
