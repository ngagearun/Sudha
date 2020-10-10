
class Honda{
	int speed=100;	
	 void speedcalculator(int hours){
	         System.out.println(speed*hours);		
	}
}

public class CalculateBikeSpeed extends Honda {
	
	public static void main(String[] args){
		
		CalculateBikeSpeed calculate=new CalculateBikeSpeed();
		calculate.speedcalculator(2000);
	}

}
