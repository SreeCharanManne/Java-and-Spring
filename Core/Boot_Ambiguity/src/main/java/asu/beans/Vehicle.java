package asu.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component("Vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("DieselEngine")
	private Engine eng;

	public Vehicle() {
	}

	public void move() {
		eng.start();
		System.out.println("Journey Started");
		eng.stop();
	}

}
