package NewProgramme;
import java.util.Scanner;
class Programmee {
	
	
	int add(int a,int b) 
	{
		return a+b ;
	}
 float add(float a,float b ,float c) 
	{
		return a+b+c ;
	}
		int add(int a)
		{
		return a*a;
		}
}
public class Programme7{
	
	public static void main (String[] args) {
		Programmee p=new Programmee();
		
		System.out.println(p.add(9,9));
		System.out.println(p.add(2.2f,2.2f,3.9f));
		System.out.println(p.add(9));
		
		
	
}
}
		

