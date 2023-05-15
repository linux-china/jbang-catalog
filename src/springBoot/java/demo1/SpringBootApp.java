///usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 17
//DEPS org.springframework.boot:spring-boot-dependencies:3.0.6@pom
//DEPS org.springframework.boot:spring-boot-starter
//FILES ../application.properties
//JAVA_OPTIONS -Dnick=linux_china2 -Dserver.port=9000
package demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
public class SpringBootApp implements CommandLineRunner {
    @Value("${nick:Guest}")
    private String nick;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello " + nick);
    }
}
