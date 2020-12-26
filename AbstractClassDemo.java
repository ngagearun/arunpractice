
public class AbstractClassDemo {

	public static void main(String[] args) {
		
		Customer  obj;//reference
		
		 obj=new HDFCBankClass();
		obj.fundtransfer();
		obj.changecustomerdetails("arun");
		
		 obj=new SBIBankClass();
		obj.fundtransfer();

	}

}
