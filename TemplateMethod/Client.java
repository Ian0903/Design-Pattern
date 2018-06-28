package TemplateMethod;

public class Client {
	
	public static void main(String[] args){
		Coffee c = new Coffee();
		c.prepateRecipe();
		
		Tea t = new Tea();
		t.prepateRecipe();
	}
}
