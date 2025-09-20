package school.sorokin.javacore.spring_hibernate_jpa.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:application.properties")
public class Configuration {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
