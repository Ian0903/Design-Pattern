package Proxy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		String image = "http://image.jpg";
		URL url = new URL(image);
		RealImage realImage = new RealImage(url);
		ImageProxy ip = new ImageProxy(realImage);
		ip.showImage();
	}

}
