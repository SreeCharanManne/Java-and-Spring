package asu.beans;
import org.springframework.stereotype.Component;

@Component("PetrolEngine")
public class PetrolEngine implements Engine {
	public PetrolEngine() {
		System.out.println("Petrol Engine Constructor");
	}

	public void start() {
		System.out.println("Petrol Engine Started");
	}

	public void stop() {
		System.out.println("Petrol Engine Stopped");
	}

}
