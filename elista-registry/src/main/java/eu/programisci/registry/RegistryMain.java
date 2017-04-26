package eu.programisci.registry;

import eu.programisci.registry.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = {"eu.programisci.registry"})
@EnableConfigurationProperties({MongoConfig.class})
public class RegistryMain {

  public static void main(String[] args) {
    SpringApplication.run(RegistryMain.class, args);
  }
}

