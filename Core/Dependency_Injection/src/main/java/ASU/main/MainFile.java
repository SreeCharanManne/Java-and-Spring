package ASU.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ASU.beans.WishMessageGenerator;
import java.time.LocalDateTime;

public class MainFile {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/ASU/cfgs/ApplicationProperties.xml");
        LocalDateTime ldt = (LocalDateTime) ctx.getBean("ldt");
        WishMessageGenerator gen = (WishMessageGenerator) ctx.getBean("wmg");
        gen.showWishMessage();
    }
}
