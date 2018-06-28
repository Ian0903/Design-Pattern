package Proxy;

import java.net.URL;

public class RealImage implements Image{
	
	private URL imageUrl;
	private long startTime;
	private int height;
	private int width;
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
	@Override
	public void showImage() {
		// TODO 自动生成的方法存根
		System.out.println("Real Image : " + imageUrl);
	}
	
	public RealImage(URL imageUrl){
		this.imageUrl = imageUrl;
		this.startTime = System.currentTimeMillis();
		this.height = 600;
		this.width = 600;
	}
	
	public boolean isLoad(){
		//模拟图片加载
		long endTime = System.currentTimeMillis();
		return endTime - startTime > 3000;
	}

}
