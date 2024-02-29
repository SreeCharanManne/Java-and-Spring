package asu.beans;
import org.springframework.stereotype.Component;

@Component("DieselEngine")
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("Diesel Engine Constructor");
	}

	public void start() {
		System.out.println("Diesel Engine Started");
	}

	public void stop() {
		System.out.println("Diesel Engine Stopped");
	}
}
