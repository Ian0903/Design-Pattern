package FactoryMethod;

public class ConcreteCreator1 extends Creator{

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct1();
	}
}
