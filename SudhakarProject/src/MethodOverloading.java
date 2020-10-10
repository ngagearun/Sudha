
public class MethodOverloading {
	
	static int sum;
		
    static void calcuateaddition(int num1,int num2){
		
		sum=num1+num2;
		System.out.println(sum);
	}
	
  static  void calcuateaddition(int num1,int num2,int num3){
		
		sum=num1+num2+num3;
		System.out.println(sum);
	}
	
	static void calculateaddition(float num1,float num2){
		sum=(int) (num1+num2);
		System.out.println(sum);
	}
	
 
	public static void main(String[] args) {
		
		MethodOverloading.calcuateaddition(200, 2);
		//method.calcuateaddition(456, 543);
		
	}

}
