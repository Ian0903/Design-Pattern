package Singleton;
/*
 * 懒汉式-线程不安全
 */

public class UnsafeDelaySingleton {
	public static UnsafeDelaySingleton uds;
	
	private UnsafeDelaySingleton(){}
	
	public static UnsafeDelaySingleton getInstance(){
		if(uds == null){
			uds = new UnsafeDelaySingleton();
		}
		return uds;
	}
}
