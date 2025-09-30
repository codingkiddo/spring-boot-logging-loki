package com.spring_boot_logging_loki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggingLokiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingLokiApplication.class, args);
	}
	
	private static final Logger LOG = LoggerFactory.getLogger(SpringBootLoggingLokiApplication.class);

    public void log() {
        LOG.info("DemoService.log invoked");
    }


}
