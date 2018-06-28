package State;

public class NoQuarterState implements State{
	GumballMachine gm;

    public NoQuarterState(GumballMachine gm) {
    	this.gm = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gm.setState(gm.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
