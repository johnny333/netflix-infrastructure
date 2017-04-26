package eu.programisci.dictionaries;

import eu.programisci.dictionaries.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"eu.programisci.dictionaries"})
@RestController
@EnableEurekaClient
@EnableConfigurationProperties({MongoConfig.class})
public class DictionariesMain {

  public static void main(String[] args) {
    SpringApplication.run(DictionariesMain.class, args);
  }
}

