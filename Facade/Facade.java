package Facade;

public class Facade {
	TvSystem ts = new TvSystem();
	
	public void watchTv(){
		ts.turnOnTv();
		ts.setCD();
		ts.startWatching();
	}
}
