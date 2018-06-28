package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;

	public WeatherData(){
		observers = new ArrayList();
	}



	public void removeObserver(Observer obs){
		int i = observers.indexOf(obs);
		if(i>0){
			observers.remove(i);
		}
	}

	public void registerObserver(Observer obs){
		observers.add(obs);
	}

	public void notifyObservers(){
		for(int i = 0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature);
		}
	}

	public void setTemperature(float temperature){
		this.temperature = temperature;
		measurementChanged();
	}

	public void measurementChanged(){
		notifyObservers();
	}
}
