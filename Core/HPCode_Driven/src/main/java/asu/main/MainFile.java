package asu.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import asu.beans.WishMessageGenerator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import asu.cfgs.AppConfig;
import java.time.LocalDateTime;

public class MainFile {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        WishMessageGenerator gen = (WishMessageGenerator) ctx.getBean("wmg");
        gen.showWishMessage();
    }
}
