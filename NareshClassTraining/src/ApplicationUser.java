import java.util.ArrayList;


public class ApplicationUser {
	
	public static void main(String[] args){
		
		RepairShop samsung=new Mobiles();		
		samsung.mobile("Samsung 50");
		
		Rahul s1=new Sanjana();
		s1.mobile_dancing();
		
		
		Paizabazaar  verifyinterest;
		
		verifyinterest=new HDFCBank();
		System.out.println(verifyinterest.getrateofinterest());
		
		verifyinterest=new SBIBank();
		System.out.println(verifyinterest.getrateofinterest());
		
		WebDriver objname;
		objname=new FirefoxDriver();
		objname.get();
		objname.close();
		
		
		

	}

}
