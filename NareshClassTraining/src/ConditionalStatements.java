
public class ConditionalStatements {

	static void  ifelse(int num){
		
		if(num%2==0){
			System.out.println("Even number");
		}else{
			System.out.println("Odd number");
		}
	}
		
    static void nestedifelse(int num1,int num2,int num3){
    
    	if(num1>num2 &&  num1>num3){
    		System.out.println("num1 is largest numr");
    	}else if(num2>num1 && num2>num3){
    		System.out.println("num2 is largest nmber");
    	}{
    		System.out.println("num3 is largest");
    	} 	
    	
    }		
	
	
	
	public static void main(String[] args) {
		
		ConditionalStatements.ifelse(300);
		ConditionalStatements.nestedifelse(200, 43, 767);
	}

}
