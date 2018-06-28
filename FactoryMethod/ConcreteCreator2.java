package FactoryMethod;

public class ConcreteCreator2 extends Creator {

	@Override
	public Product factoryMethod() {
		// create concreteProduct2
		return new ConcreteProduct2();
	}

}
