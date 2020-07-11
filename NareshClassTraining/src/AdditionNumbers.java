import java.util.Scanner;


public class AdditionNumbers {
	int add;
	
	int a=100;
	
	int sum(int num1,int num2){
	add=num1+num2;
	return add;
	}

	public static void main(String[] args) {
	
		AdditionNumbers obj=new AdditionNumbers();
		int output=obj.sum(200, 300);
		
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println(num1);
		
		
		
		

	}

}
