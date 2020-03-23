package CoffeeProgram;

public interface CoffeMachineinterface {
	
	public void chooseFirstSelection();	
	public void chooseSecoundSelection();
	
	
	public static void main (String[] arrgs){
		
		OldCoffeeMachine ToBeFittedWithTouchScreeen = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter TouchScreenInterface = new CoffeeTouchscreenAdapter(ToBeFittedWithTouchScreeen);
		TouchScreenInterface.chooseFirstSelection();
		TouchScreenInterface.chooseSecoundSelection();
		
		
	}
	
	
	
	
}