class Vehicle{
	
	static int speed=100;
	
	static void calculatespeed(){
		System.out.println(speed);
	}
}




public class Yamaha extends Vehicle{

	public static void main(String[] args) {
		System.out.println(speed);
		Yamaha.calculatespeed();

	}

}
