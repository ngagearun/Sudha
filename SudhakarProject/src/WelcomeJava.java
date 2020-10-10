
 class WelcomeJava {
	 //instance variables
	 int num1=100;
	 
	 static int num2=200;
	 
	 //instance method
	 void display(){
		 int num1=600;
		 System.out.println(WelcomeJava.num2);
		 System.out.println("I am in display method");
		 System.out.println(num1);
	 }
	 
	 //static method
	 static void show(){
		 System.out.println(WelcomeJava.num2);
		System.out.println("i am in show method"); 
	 }
	 
	 public static void main(String[] args){
		 
		 WelcomeJava welcome=new WelcomeJava();
		 welcome.display();
		 
		 WelcomeJava welcome1=new WelcomeJava();
		 welcome1.display();
		 
		 
		 WelcomeJava.show();
		 
		 //integer variable
		 
		 int num=1001;
		 
		 //boolen value
		 
		 boolean status=true;
		 
		 //float value
		 float pi=3.14f;
		 
		 //char valluue
		 char ch='a';
		 
		 //string value
		 
		 String name="Arun";
		 
		 
		 System.out.println("Hello Welcome to Java/Selenium training");
		 
		 System.out.println(num);
		 
	 }

}
