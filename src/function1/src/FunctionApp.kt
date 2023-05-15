///usr/bin/env jbang "$0" "$@" ; exit $?

//KOTLIN 1.8.21
//JAVA 17
//DEPS org.springframework.boot:spring-boot-dependencies:3.0.6@pom
//DEPS org.springframework.cloud:spring-cloud-starter-function-webflux:4.0.2
//DEPS org.jetbrains.kotlin:kotlin-stdlib:1.8.21
//DEPS org.jetbrains.kotlin:kotlin-reflect:1.8.21

package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
open class SpringBootFunctionApp {

    @Bean
    open fun supplier(): () -> String {
        return { "Hello from Kotlin" }
    }

    @Bean
    open fun uppercase(): (String) -> String {
        return { it.toUpperCase() }
    }

    @Bean
    open fun consumer(): (String) -> Unit {
        return { println(it) }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootFunctionApp::class.java, *args)
}
