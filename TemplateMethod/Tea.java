package TemplateMethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		// TODO 自动生成的方法存根
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		// TODO 自动生成的方法存根
		System.out.println("Adding lemon");
	}

}
