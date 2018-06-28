package Decorator;

public class Espressor extends Beverage{
	
	public Espressor(){
		description = "Espressor";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
