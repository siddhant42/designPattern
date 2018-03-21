package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	public MyTopic() {
		this.observers = new ArrayList<>();
	}
	@Override
	public void register(Observer observer) {
		synchronized(observers){
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized(observers) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> list = null;
		synchronized(observers) {
			if(!changed) return;
			list = this.observers;
			this.changed = false;
			for(Observer obj:list) {
				obj.update();
			}
		}

	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}
	public void postMessage(String msg) {
		System.out.println("Mesage posted "+msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}
}
