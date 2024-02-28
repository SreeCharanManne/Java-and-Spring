package ASU.beans;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;

@Component("wmg")
public class WishMessageGenerator {

	private LocalDateTime ldt;
	
	public WishMessageGenerator(LocalDateTime ldt) {
		System.out.println("Injected LocalDateTime in Constructor: " + ldt);
		this.ldt = ldt;
	}
	
	public void setLocalDateTime(LocalDateTime ldt) {
		System.out.println("Injected LocalDateTime in Setter method: " + ldt);
		this.ldt = ldt;
	}

	public void assignDate(LocalDateTime ldt) {
		System.out.println("Injected LocalDateTime in Arbitary method: " + ldt);
		this.ldt = ldt;
	}

	public void showWishMessage() {

		int hour = ldt.getHour();
		if (hour < 12) {
			System.out.println("Good Morning!");
		} else if (hour >= 12 && hour < 18) {
			System.out.println("Good Noon!");
		} else {
			System.out.println("Good Night!");
		}
	}
}
