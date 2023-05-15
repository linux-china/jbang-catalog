///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.slf4j:slf4j-simple:2.0.7
//DEPS info.picocli:picocli-codegen:4.7.3
//DEPS io.github.cdimascio:dotenv-java:3.0.0
//DEPS info.picocli:picocli:4.7.3
//DEPS org.projectlombok:lombok:1.18.26

package org.mvnsearch;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

@Command(name = "Hello", mixinStandardHelpOptions = true, version = "Hello 0.1",
        description = "Hello made with jbang")
public class DemoCli implements Callable<Integer> {

    @Parameters(index = "0", description = "The greeting to print", defaultValue = "World!")
    private String greeting;

    public static void main(String... args) {
        int exitCode = new CommandLine(new DemoCli()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        System.out.println("Hello22 " + greeting);
        return 0;
    }
}
