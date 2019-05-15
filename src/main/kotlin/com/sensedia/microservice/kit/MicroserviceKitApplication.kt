package com.sensedia.microservice.kit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceKitApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceKitApplication>(*args)
}
