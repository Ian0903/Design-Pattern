package TemplateMethod;

public abstract class CaffeineBeverage {

	final void  prepateRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boild water!");
	}
	
	void pourInCup(){
		System.out.println("Pour in cup!");
	}
}
