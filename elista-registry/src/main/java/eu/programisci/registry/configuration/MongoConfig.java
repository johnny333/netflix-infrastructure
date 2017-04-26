package eu.programisci.registry.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by jakub on 26.04.17.
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {


  @Override
  protected String getDatabaseName() {
    return "e_lista_registry";
  }

  @Override
  @Bean
  public Mongo mongo() throws Exception {
    return new MongoClient("127.0.0.1");
  }
}
