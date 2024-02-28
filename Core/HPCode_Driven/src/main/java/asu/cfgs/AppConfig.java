package asu.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages="asu")
public class AppConfig {
	
	@Bean("ldt")
	public LocalDateTime someMethod()
	{
		return LocalDateTime.now();
	}
	


}
