package Observer;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WeatherData w = new WeatherData();
		TemperatureDisplay td = new TemperatureDisplay(w);
		w.setTemperature(26.7f);
	}

}
