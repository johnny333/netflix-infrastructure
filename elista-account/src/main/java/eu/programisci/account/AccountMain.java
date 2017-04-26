package eu.programisci.account;

import eu.programisci.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"eu.programisci.account"})
@RestController
@EnableEurekaClient
@EnableConfigurationProperties({MongoConfig.class})
public class AccountMain {

  public static void main(String[] args) {
    SpringApplication.run(AccountMain.class, args);
  }

}

