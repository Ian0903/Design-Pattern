package Singleton;
/*
 * 饿汉式-线程安全
 */
public class HungrySingleton {
	private static HungrySingleton hs = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return hs;
	}
}
