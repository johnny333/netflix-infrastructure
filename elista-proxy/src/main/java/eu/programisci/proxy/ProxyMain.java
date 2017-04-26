package eu.programisci.proxy;

import eu.programisci.proxy.configuration.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(scanBasePackages = {"eu.programisci.proxy"})
@EnableZuulProxy
@EnableConfigurationProperties({MongoConfig.class})
public class ProxyMain {

  public static void main(String[] args) {
    SpringApplication.run(ProxyMain.class, args);
  }
}
