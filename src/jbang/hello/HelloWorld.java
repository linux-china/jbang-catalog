///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.slf4j:slf4j-simple:1.7.30
//DEPS org.projectlombok:lombok:1.18.12

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {
    public static void main(String[] args) {
        log.info("Starting");
        System.out.println("Hello world!");
        System.out.println("Java version: " + System.getProperty("java.version"));
    }

    @Data
    public static class User {
        private Integer id;
        private String name;
    }
}
