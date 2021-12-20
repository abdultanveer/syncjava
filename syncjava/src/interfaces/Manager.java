package interfaces;

public class Manager {
	
	public static void main(String[] args) {
		SwitchBoardListener sListener = new GEAppliances();
				//HavellsAppliances(); //wiring
		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree();
		sListener.switchFour();
		sListener.switchFive();

	}

}
