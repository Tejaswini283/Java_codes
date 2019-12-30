package NewProgramme;
import java.io.*;
public class TestClass {
	public static void main (String []args) throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		System.out.println("enter 2 values");
		try{
		a=Integer.parseInt(in.readLine());
		b=Integer.parseInt(in.readLine());
		double x=a/b;
		System.out.println("result"+x);
		}
		
		catch (ArithmeticException | NumberFormatException | IOException ex)
		{
		System.out.println("ERROR"+ex.getMessage());
	}
	
	System.out.println("executed");
}
}