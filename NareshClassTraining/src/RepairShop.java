
public abstract class RepairShop {
	 
	 abstract void mobile(String mobilemodel);
	 abstract void computer();
	 

}

class Mobiles extends RepairShop{
	
	void mobile(String mobileString){
		System.out.println(mobileString);
	}

	@Override
	void computer() {
		
	}

	
	
}
