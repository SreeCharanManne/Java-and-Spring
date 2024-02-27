package ASU.beans;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;

@Component("wmg")
public class WishMessageGenerator {

    //@Autowired
    private LocalDateTime ldt;
    
    //@Autowired
    public WishMessageGenerator(LocalDateTime ldt)
    {
    	this.ldt=ldt;
    }
    
    //@Autowired
    public void setLocalDateTime(LocalDateTime ldt)
    {
    	this.ldt=ldt;
    }
    //@Autowired
    public void assignDate(LocalDateTime ldt)
    {
    	this.ldt=ldt;
    }

    public void showWishMessage() {
        System.out.println("Injected LocalDateTime: " + ldt);

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
