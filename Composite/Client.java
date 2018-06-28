package Composite;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Component node1 = new Leaf("leaf1");
		
		Component node2 = new Leaf("leaf2");
		
		Component node3 = new Composite("composite3");
		
		Component root = new Composite("root");
		
		root.add(node1);
		root.add(node2);
		root.add(node3);
		
		Component node31 = new Leaf("leaf31");	
		node3.add(node31);
		root.print();
	}

}
