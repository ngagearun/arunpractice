
public class ThisKeyWord  {
	
	int a,b;
	
	 void input(int a,int b){
		this.a=a;
		this.b=b;
		display();
		
	}
	
	void display(){
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyWord sample=new ThisKeyWord();
		sample.input(200, 300);
		sample.display();

	}

}
