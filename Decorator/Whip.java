package Decorator;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription() + "," + "whip";
	}

	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return .21 + beverage.cost();
	}

}
