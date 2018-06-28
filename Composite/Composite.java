package Composite;

import java.util.ArrayList;
import java.util.Iterator;


public class Composite extends Component{

	ArrayList leaves = new ArrayList();
	
	String name;
	
	public Composite(String name){
		this.name = name;
	}
	
	@Override
	public void add(Component component){
		leaves.add(component);
	}
	
	@Override
	public void remove(Component component){
		leaves.remove(component);
	}
	
	@Override
	public void print(){
		System.out.println(name);
		Iterator iterator = leaves.iterator();
		while(iterator.hasNext()){
			Component c = (Component) iterator.next();
			c.print();
		}
	}
}
