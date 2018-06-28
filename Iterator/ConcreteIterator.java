package Iterator;

public class ConcreteIterator<Item> implements Iterator{

	private Item[] items;
	
	private int position = 0;
	
	public ConcreteIterator(Item[] items){
		this.items = items;
	}
	@Override
	public Object next() {
		// TODO 自动生成的方法存根
		return items[position++];
	}

	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		return position < items.length;
	}

}
