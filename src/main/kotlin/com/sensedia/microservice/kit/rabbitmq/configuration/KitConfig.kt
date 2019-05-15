package com.sensedia.microservice.kit.rabbitmq.configuration

import com.sensedia.microservice.kit.rabbitmq.sender.KitSender
import org.springframework.amqp.core.Queue
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KitConfig {

    @Bean(name = ["kit-queue"])
    fun kitQueue() = Queue("apix-kit-queue")

    @Bean(name = ["kit-sender"])
    fun kitSender() = KitSender()

}
