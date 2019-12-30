import java.util.Scanner;
public class Program4 {
	public static void main (String []args) throws Exception {
		String []name= {"a@gmail.com","k@hotmail.com","o@yahoo.com","m@rediffmail.com","n@gmail.com","m@hotmail.com","l@yahoo.com","s@rediffmail.com","q@hotmail.com","y@yahoo.com"};
		System.out.println("GMAIL");
		for(int i=0;i<name.length;i++)	
		{
			if(name[i].contains("@gmail.com")==true)
			{
				
				System.out.println(name[i]);
				}
		}
			System.out.println("yahoo");
			
			for(int i=0;i<name.length;i++)	
			{
			
			if(name[i].contains("@yahoo.com")==true)
			{
				
				System.out.println(name[i]);
				}
			
			}
			System.out.println("hotmail");
			for(int i=0;i<name.length;i++)	
			{
			
			if(name[i].contains("@hotmail.com")==true)
			{
				
				System.out.println(name[i]);
				}
			}
			System.out.println("rediff");
			for(int i=0;i<name.length;i++)	
			{
			if(name[i].contains("@rediffmail.com")==true)
			{
				
				System.out.println(name[i]);
				}
			}
			}
	
	
}

