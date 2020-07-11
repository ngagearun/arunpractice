
public class MethodOverLoading {
	
	int area;
	
	int calculatearea(int radius){
		area=radius*radius;
		return area;		
	}
	
	String calculatearea(int length,int width,int height){
		area=length*width*height;
		return "area";
	}
	
	int calculatearea(int length,int breadth){
		area=length*breadth;
		return area;
	}

	public static void main(String[] args) {
	
		MethodOverLoading method=new MethodOverLoading();
		System.out.println(method.calculatearea(300));
	}

}
