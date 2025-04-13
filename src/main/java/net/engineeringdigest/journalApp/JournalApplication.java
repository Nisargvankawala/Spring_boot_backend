package net.engineeringdigest.journalApp;// This will scan class present in this package and not the outside one


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This does 3 thing (task of 3 annotation),and it is written on the main class
//1.@Configuration
//2.@EnableAutoConfiguration --> automation read configure (Eg: if we mention server port and server address in resources it will read from that)
//3.@ComponentScan  --> scan for class for IOC container
@SpringBootApplication
public class JournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalApplication.class, args);
    }


}