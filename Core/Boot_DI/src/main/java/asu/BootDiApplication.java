package asu;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import org.springframework.context.ApplicationContext;
import asu.beans.WishMessageGenerator;

@SpringBootApplication
public class BootDiApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(BootDiApplication.class, args);
		WishMessageGenerator wm=ac.getBean("wmg",WishMessageGenerator.class);
		wm.showWishMessage();
		
	}

	@Bean
	public LocalDateTime giveLdt() {
		return LocalDateTime.now();
	}

}
