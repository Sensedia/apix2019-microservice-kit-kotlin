package com.sensedia.microservice.kit

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = [MicroserviceKitApplication::class])
@SpringBootApplication
class MicroserviceKitApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceKitApplication>(*args)
}
