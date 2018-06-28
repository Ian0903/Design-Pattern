package Singleton;
/*
 * 双重检验加锁-线程安全-性能好-Java 5以上
 */
public class DoubleLockSingleton {
	private static volatile DoubleLockSingleton dls;
	
	private DoubleLockSingleton(){}
	
	public static DoubleLockSingleton getInstance(){
		if(dls == null){
			synchronized(DoubleLockSingleton.class){
				if(dls == null){
					dls = new DoubleLockSingleton();
				}
			}
		}
		return dls;
	}
	
}
