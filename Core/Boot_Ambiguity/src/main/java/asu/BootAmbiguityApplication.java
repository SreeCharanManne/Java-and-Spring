package asu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import asu.beans.Vehicle;

@SpringBootApplication
public class BootAmbiguityApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(BootAmbiguityApplication.class, args);
		Vehicle vc=ac.getBean("Vehicle",Vehicle.class);
		vc.move();
		((ConfigurableApplicationContext) ac).close();
	}

}
