package asu.beans;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


@Component("wmg")
public class WishMessageGenerator {
	
    @Value("${per.name}")
    String name;

    //@Autowired
    private LocalDateTime ldt;
  
    public WishMessageGenerator(@Qualifier("localdatetime")LocalDateTime ldt)
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
            System.out.println("Good Morning - "+name);
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Noon - "+ name);
        } else {
            System.out.println("Good Night - " + name);
        }
    }
}
