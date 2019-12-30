package NewProgramme;

interface Inter1{
	int sum(int i,int j);
}

public class AnnInterface {

	public static void main (String[] args) {
		
		Inter1 i1=(i,j)->{System.out.println("Sum");
		return i+j;};
		System.out.println(i1.sum(5,6));
			
	}
}