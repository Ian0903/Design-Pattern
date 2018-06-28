package AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		// TODO 自动生成的方法存根
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO 自动生成的方法存根
		return new ConcreteProductB2();
	}

}
