package asu.beans;
import org.springframework.stereotype.Component;

@Component("ElectricEngine")
public class ElectricEngine implements Engine {
	public ElectricEngine() {
		System.out.println("Electric Motor Constructor");
	}

	public void start() {
		System.out.println("Electric Motor Started");
	}

	public void stop() {
		System.out.println("Electric Motor Stopped");
	}

}
