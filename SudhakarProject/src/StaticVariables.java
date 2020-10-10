
public class StaticVariables {
	
	static int num1=100;
	

	public static void main(String[] args) {
		
		StaticVariables vr1=new StaticVariables();	
		vr1.num1=300;
		
		StaticVariables vr2=new StaticVariables();
		vr2.num1=500;
		
		System.out.println(vr1.num1);
		System.out.println(vr2.num1);

	}

}
