package State;

public class HasQuarterState implements State {
	
	GumballMachine gm;
	
	public HasQuarterState(GumballMachine gm){
		this.gm = gm;
	}

	@Override
	public void insertQuarter() {
		// TODO 自动生成的方法存根
		System.out.println("You have inserted quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO 自动生成的方法存根
		System.out.println("Eject back quarter to you");
		gm.setState(gm.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO 自动生成的方法存根
		System.out.println("You turned..");
		gm.setState(gm.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO 自动生成的方法存根
		System.out.println("No gumball dispensed");
	}

}
