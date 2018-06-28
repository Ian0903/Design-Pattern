package State;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GumballMachine gm = new GumballMachine(3);
		
		gm.insertQuarter();
		gm.turnCrank();
		
	
		gm.insertQuarter();
		gm.ejectQuarter();
		
		
	}

}
