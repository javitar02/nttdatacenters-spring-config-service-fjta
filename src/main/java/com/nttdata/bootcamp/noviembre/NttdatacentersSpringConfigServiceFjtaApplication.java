package com.nttdata.bootcamp.noviembre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NttdatacentersSpringConfigServiceFjtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringConfigServiceFjtaApplication.class, args);
	}

}
