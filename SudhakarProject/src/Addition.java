
public class Addition {
	
	int sum;	
	
	void calculateaddition(int num1,int num2){
		
		sum=num1+num2;
		System.out.println("The Addition of 2 numbers is"+sum);
	}
	

	public static void main(String[] args) {
		Addition add=new Addition();
		add.calculateaddition(200,400);
		add.calculateaddition(400,400);
		add.calculateaddition(566, 345);

	}

}
