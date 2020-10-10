interface Mobile{
	
	abstract void controldevicesmobile();
	abstract void cookingthroughmobile();
	abstract void makingsoundwhenchargedfully();
	
	
}

class Apple implements Mobile{

	@Override
	public void cookingthroughmobile() {
		System.out.println("Cooking through Mobile");
		
	}

	@Override
	public void makingsoundwhenchargedfully() {
		System.out.println("Make sound when charged fully");
		
	}

	@Override
	public void controldevicesmobile() {
		// TODO Auto-generated method stub
		
	}
	
}


class Samsung implements Mobile{

	@Override
	public void controldevicesmobile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cookingthroughmobile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makingsoundwhenchargedfully() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractionClass {
	
	public static void main(String[] args){
		
		Mobile user1;
		user1=new Samsung();
		user1.makingsoundwhenchargedfully();
		user1.controldevicesmobile();
		
		
		user1=new Apple();
		user1.cookingthroughmobile();
		
	}

}
