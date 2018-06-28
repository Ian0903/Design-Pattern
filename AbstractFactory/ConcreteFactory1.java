package AbstractFactory;

public class ConcreteFactory1 implements AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		// TODO 自动生成的方法存根
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO 自动生成的方法存根
		return new ConcreteProductB1();
	}

}
