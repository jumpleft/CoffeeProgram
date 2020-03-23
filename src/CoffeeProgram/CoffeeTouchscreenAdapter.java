package CoffeeProgram;

public class CoffeeTouchscreenAdapter implements CoffeMachineinterface {
	
	private OldCoffeeMachine coffeeMachine; 
	
	
	
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		coffeeMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		coffeeMachine.selectA();
		
	}
	
	public void chooseSecoundSelection() {
		coffeeMachine.selectB();
	}

}
