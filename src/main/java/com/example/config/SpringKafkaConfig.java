package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

//@Configuration
public class SpringKafkaConfig implements CommandLineRunner{

	@Autowired
    private KafkaTemplate<String, String> template;
	
	@Override
	public void run(String... args) throws Exception {
		this.template.send("","");
		
	}

}
