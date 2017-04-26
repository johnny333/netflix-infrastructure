package eu.programisci.settings;

import eu.programisci.settings.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"eu.programisci.settings"})
@RestController
@EnableEurekaClient
@EnableConfigurationProperties({MongoConfig.class})
public class SettingsMain {

  public static void main(String[] args) {
    SpringApplication.run(SettingsMain.class, args);
  }
}

