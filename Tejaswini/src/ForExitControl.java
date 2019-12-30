import java.util.Scanner;
public class ForExitControl {
	public static void main (String []args) {
		int n,i,j;
		System.out.println("enter");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++) {
			for( j=1;j<=i;j++)
			{
				System.out.print(""+j);
				
			}
			System.out.println(""+i);
		}
		
	
		

}
}