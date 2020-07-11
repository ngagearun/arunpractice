
public class StaticConcept {

	static int num1=100;
	
	
	public static void main(String[] args) {
		
		StaticConcept obj1=new StaticConcept();
		obj1.num1=200;
		StaticConcept obj2=new StaticConcept();
		
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		
		
		
		
		

	}

}
