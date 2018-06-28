package Observer;

public class TemperatureDisplay implements Observer {
	private Subject weatherData;
	private float temperature;

	public TemperatureDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature){
		this.temperature = temperature;
		display();
	}

	public void display(){
		System.out.println("Current temperature is " + temperature);
	}
}
