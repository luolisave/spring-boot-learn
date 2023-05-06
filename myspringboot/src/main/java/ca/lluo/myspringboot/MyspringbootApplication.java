package ca.lluo.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.System;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyspringbootApplication {

	public static void main(String[] args) {
		java.lang.System.out.println("------------------ my main() ---------------------");
		SpringApplication.run(MyspringbootApplication.class, args);
	}

}
