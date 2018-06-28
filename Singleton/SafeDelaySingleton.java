package Singleton;
/*
 * 懒汉式-线程安全
 */

public class SafeDelaySingleton {
	public static SafeDelaySingleton sds;
	
	private SafeDelaySingleton(){}
	
	public static synchronized SafeDelaySingleton getInstance(){
		if(sds == null){
			sds = new SafeDelaySingleton();
		}
		return sds;
	}
}
