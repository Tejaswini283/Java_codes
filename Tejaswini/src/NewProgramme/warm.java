package NewProgramme;
class Outer{
	void outerMethod() {
		System.out.println("from outer");
	}
static class Inner{
	void innerMethod() {
		System.out.println("from inner");
	}
}
}



public class warm {
	public static void main (String []args)  {
		Outer outerobj=new Outer();
		//Outer.Inner innerObj=outerObj.new Inner();
		outerobj.outerMethod();
		Outer.Inner innerObj=new Outer.Inner();
		innerObj.innerMethod();
		
				
		
	}


}
