
 abstract class Sunil {
	
	abstract void mobile_music_control();
	abstract void mobile_lighting__control();
	abstract void mobile_cooking();

}

 
 abstract class Rahul extends Sunil{
	 
	 void mobile_music_control(){
		 
	 }
	 
	 abstract void mobile_lighting__control();
	 abstract void mobile_cooking();
	 abstract void mobile_dancing();
	 
 }
 
 
 class Sanjana extends Rahul{

	@Override
	void mobile_lighting__control() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mobile_cooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mobile_dancing() {
		// TODO Auto-generated method stub
		
	}
	 
 }