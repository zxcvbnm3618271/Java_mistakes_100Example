package solve.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource({"classpath:spring.xml"})
@ComponentScan(basePackages = {"solve"})
public class initMain {
  public static void main(String[] args) {
    SpringApplication.run(initMain.class, args);

  }
}
