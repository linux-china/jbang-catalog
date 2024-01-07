///usr/bin/env jbang "$0" "$@" ; exit $?

//KOTLIN 1.9.21
//JAVA 21
//DEPS org.springframework.boot:spring-boot-dependencies:3.2.1@pom
//DEPS org.springframework.cloud:spring-cloud-starter-function-webflux:4.1.0
//DEPS org.jetbrains.kotlin:kotlin-stdlib:1.9.21
//DEPS org.jetbrains.kotlin:kotlin-reflect:1.9.21

package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.*


@SpringBootApplication
open class SpringBootFunctionApp {

    @Bean
    open fun supplier(): () -> String {
        return { "Hello from Kotlin" }
    }

    @Bean
    open fun uppercase(): (String) -> String {
        return { it.uppercase(Locale.getDefault()) }
    }

    @Bean
    open fun consumer(): (String) -> Unit {
        return { println(it) }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootFunctionApp::class.java, *args)
}
