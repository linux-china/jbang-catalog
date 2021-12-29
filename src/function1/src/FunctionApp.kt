///usr/bin/env jbang "$0" "$@" ; exit $?
//KOTLIN 1.6.10
//DEPS org.springframework.boot:spring-boot-dependencies:2.6.2@pom
//DEPS org.springframework.cloud:spring-cloud-starter-function-webflux:3.2.1
//DEPS org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10
//DEPS org.jetbrains.kotlin:kotlin-reflect:1.6.10

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
