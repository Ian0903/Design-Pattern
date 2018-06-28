package Proxy;

public class ImageProxy implements Image{

	private RealImage realImage;
	
	public ImageProxy(RealImage realImage){
		this.realImage = realImage;
	}
	
	@Override
	public void showImage() {
		// TODO 自动生成的方法存根
		try{
			System.out.println("ImageProxy : " + realImage.getHeight() +","+realImage.getWidth());
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		realImage.showImage();
	}
	

}
