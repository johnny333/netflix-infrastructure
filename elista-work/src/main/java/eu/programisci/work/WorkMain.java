package eu.programisci.work;

import eu.programisci.work.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"eu.programisci.work"})
@RestController
@EnableEurekaClient
@EnableConfigurationProperties({MongoConfig.class})
public class WorkMain {

  public static void main(String[] args) {
    SpringApplication.run(WorkMain.class, args);
  }
}

