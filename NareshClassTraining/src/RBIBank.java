
 class RBIBank {
	
	int accno,ifsccode,roi,minbalance,withdrawlimit;
	void display(){
		System.out.println("Accno :"+accno);
		System.out.println("IFSCCode"+ifsccode);
		System.out.println("roi :"+roi);
		System.out.println("minbalance"+minbalance);
		System.out.println("withdrawlimit"+withdrawlimit);
		
	}


}
 
 
 class CanaraBank extends RBIBank{
	 
	 void display(){
			System.out.println("Accno :"+accno);
			System.out.println("IFSCCode"+ifsccode);
			
		}
	 
	void enterinputdetails(){
		
		accno=234455;
		ifsccode=1234;
		roi=8;
		minbalance=19999;;
		withdrawlimit=10000;
	   super.display();
	} 
	 
 }
 
 
 class HDFC extends RBIBank{
	 
		void enterinputdetails(){
			
			accno=1234;
			ifsccode=4332;
			roi=9;
			minbalance=2000;;
			withdrawlimit=10000;
			display();
		}
		 
		 
	 }