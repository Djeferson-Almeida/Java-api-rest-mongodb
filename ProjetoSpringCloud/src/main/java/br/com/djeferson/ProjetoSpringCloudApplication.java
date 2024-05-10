package br.com.djeferson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProjetoSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringCloudApplication.class, args);
	}

}
