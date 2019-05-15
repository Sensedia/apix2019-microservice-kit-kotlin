package com.sensedia.microservice.kit.rabbitmq.sender

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.logging.Logger

@Component
class KitSender {

    private val log = Logger.getLogger(KitSender::class.java.name)

    @Autowired
    lateinit var rabbitTemplate: RabbitTemplate

    @Autowired
    @Qualifier("kit-queue")
    lateinit var queue: Queue

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    fun send(message: String) {
        rabbitTemplate.convertAndSend(queue.name, message)

        log.info(" [x] Sent '$message'")
    }
}
