package pl.gbzl.kolecki.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Radosław Chmielewski on 28.04.17.
 */
@SpringBootApplication()
@EnableSpringDataWebSupport()
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableEurekaClient
@Slf4j
public class UserBackendMain {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplicationBuilder pApp = new SpringApplicationBuilder(UserBackendMain.class);
        Environment pEnv = pApp.web(true).run(args).getEnvironment();
        final String pPort = pEnv.getProperty("server.port");
        final String pHost = InetAddress.getLocalHost().getHostAddress();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://{}:{}\n\t" +
                        "External: \thttp://{}:{}\n\t" +
                        "Szwagier: \thttp://{}:{}/swagger-ui.html\n----------------------------------------------------------",
                pHost, pPort,
                pHost, pPort,
                pHost, pPort);
    }

}
