package Iterator;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
