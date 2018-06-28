package Adapter;

public class TurkeyAdapter implements Duck{
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO 自动生成的方法存根
		turkey.gobble();
	}

}
