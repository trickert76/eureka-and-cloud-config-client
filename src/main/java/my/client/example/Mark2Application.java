package my.client.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

/**
 * Beispielapplikation einer Spring Boot Applikation. Die Anwendung kann standalone als JAR oder
 * managed als Deploymentartefakt eines Applicationservers betrieben werden. Sie registriert sich
 * bei einem Eureka Discovery Service.
 */
@EnableDiscoveryClient
@SpringBootApplication
// @EnableOAuth2Sso
@ComponentScan(basePackages = "my.client.example")
public class Mark2Application extends SpringBootServletInitializer implements WebApplicationInitializer  {

	/**
	 * Da wir die Anwendung vom SpringBoot ServletInitializer abhaengig machen, muessen wir diesem auch
	 * eine Konfiguration anvertrauen.
	 */
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(Mark2Application.class);
  }
	
  /**
   * 
   */
  public static void main(String[] args) {
        SpringApplication.run(Mark2Application.class, args);
    }
}
