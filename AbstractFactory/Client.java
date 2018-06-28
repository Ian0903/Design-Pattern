package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AbstractFactory af = new ConcreteFactory1();
		AbstractProductA productA = af.createProductA();
		AbstractProductB productB = af.createProductB();
		//do someting with productA and productB
		
	}

}
