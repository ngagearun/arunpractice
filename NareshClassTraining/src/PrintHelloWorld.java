
//Author:Arun
//Date:05/15/2020
 class PrintHelloWorld {
	 //instance variable
	 int area;
	 int accnum=1001;
	 //static variable
	static float pi=3.14f;
	 char grade='A';
	 
	 void display(){
		 System.out.println(accnum);
		System.out.println("I am in display method"); 
	 }
	 //instance
	  void checkpinnumberofperson(){
		int pinnum=12334;
		
		 System.out.println(accnum);
		 System.out.println(pi);
	 }
	 //static 
	 //system defined method
	 public static void main(String[] args){		 
		 PrintHelloWorld print=new PrintHelloWorld();
		
		 String name="NareshTechnologies";		
		 System.out.println(print.accnum);
		 System.out.println(pi);
		 
		 
		 print.display();
        
	 }	 

}
