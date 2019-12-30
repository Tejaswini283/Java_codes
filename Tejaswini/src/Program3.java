import java.util.Scanner;
public class Program3 {

		public static void main (String []args) throws Exception {
			String []name= {"a","k","o","m"};
			for(int i=0;i<name.length;i++)	
			{
				for(int j=i+1;j<name.length;j++) {
					if(name[i].compareTo(name[j])>0) {
						String temp=name[i];
						name[i]=name[j];
						name[j]=temp;
						
					}
				}
		}
			for(String names:name) {
				System.out.println(names);
			}
		}
}
