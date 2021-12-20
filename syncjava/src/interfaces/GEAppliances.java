package interfaces;

public class GEAppliances implements SwitchBoardListener{
	@Override
	public void switchOne() {
		System.out.println("GE fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("GE light is on");

	}

	@Override
	public void switchThree() {
		System.out.println("GE TV is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("GE phone is on");
		
	}

	@Override
	public void switchFive() {
		System.out.println("GE cooler is on");
		
	}
}
