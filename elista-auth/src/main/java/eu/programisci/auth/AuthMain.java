package eu.programisci.auth;

import eu.programisci.auth.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"eu.programisci.auth"})
@RestController
@EnableEurekaClient
@EnableConfigurationProperties({MongoConfig.class})
public class AuthMain {

  public static void main(String[] args) {
    SpringApplication.run(AuthMain.class, args);
  }
}

