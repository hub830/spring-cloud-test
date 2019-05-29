package top.lemna.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@EnableFeignClients("top.lemna.*")
@EnableEurekaClient
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class OrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class, args);
  }

}
