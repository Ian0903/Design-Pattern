package Decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//点一杯抹茶泡沫咖啡
		Beverage beverage = new Espressor();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription() + "\n" + "Cost:" + beverage.cost());
	}

}
