package TemplateMethod;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		// TODO 自动生成的方法存根
		System.out.println("Dripping Coffe through filter!");
	}

	@Override
	void addCondiments() {
		// TODO 自动生成的方法存根
		System.out.println("Adding sugar and milk!");
	}

}
