package smartcontract.eth.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Starter class of the microservice.
 * @author Jonathan Samson
 */

@SpringBootApplication
@EnableAutoConfiguration
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}