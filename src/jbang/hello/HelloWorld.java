///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.slf4j:slf4j-simple:1.7.30
//DEPS org.projectlombok:lombok:1.18.16
//DEPS io.github.cdimascio:dotenv-java:2.2.0
//SOURCES UserManager.java

import io.github.cdimascio.dotenv.Dotenv;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {
    public static void main(String[] args) {
        log.info("Starting");
        System.out.println("Hello world!");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println(new UserManager().findNickById(1));
        String nick = Dotenv.load().get("nick");
        System.out.println(nick);
    }

    @Data
    public static class User {
        private Integer id;
        private String name;
    }
}
