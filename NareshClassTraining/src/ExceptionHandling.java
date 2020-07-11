
public class ExceptionHandling {
	
	int num1=200,num2=10,div;
	
	void division(){
	
		try{
		div=num1/num2;
		System.out.println(div);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}

	void show() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("I am in show method");
	}
	
	void checkeligibleforvoting(int age) throws NotEligibleForVoting{
		if(age>18){
			System.out.println("Voting Elibile");
		}else{
			throw new NotEligibleForVoting("Age is not Elibile");
		}
		
	}
	public static void main(String[] args) throws InterruptedException, NotEligibleForVoting {
		
		ExceptionHandling ex=new ExceptionHandling();
		//ex.division();		
		//ex.show();
		ex.checkeligibleforvoting(15);

	}

}
