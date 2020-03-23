package CoffeeProgram;

public class Program {
	
	public static void main (String[] arrgs){
		
		OldCoffeeMachine ToBeFittedWithTouchScreeen = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter TouchScreenInterface = new CoffeeTouchscreenAdapter(ToBeFittedWithTouchScreeen);
		TouchScreenInterface.chooseFirstSelection();
		TouchScreenInterface.chooseSecoundSelection();
		
		
	}
	
	
	
	
}