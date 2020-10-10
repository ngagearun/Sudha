
public class ExceptionHandlingDemo {
	
	int div=100;
	void division(){
		try{	
		div=200/0;
		System.out.println(div);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	void display() throws InterruptedException{
		Thread.sleep(3000);
		int s=div/2;
		System.out.println(s);	
		System.out.println("I am in display method");
	}
	
	void agecalculate(int age) throws InvalidAgeException{
		
		if(age>18){
			System.out.println("Eligible");
		}else{
			throw new InvalidAgeException("Not elibile because of age");
		}
	}
	
	
	public static void main(String[] args) throws InvalidAgeException {
		ExceptionHandlingDemo ex=new ExceptionHandlingDemo();
		ex.agecalculate(15);
	}

}
