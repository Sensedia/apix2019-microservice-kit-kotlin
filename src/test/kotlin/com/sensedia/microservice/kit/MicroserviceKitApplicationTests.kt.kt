package com.sensedia.microservice.kit

import com.sensedia.microservice.kit.rabbitmq.sender.KitSender
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class MicroserviceKitApplicationTests {

	@Autowired
	lateinit var kitSender: KitSender

	@Test
	fun testSendMessage() {
		kitSender.send("Hello APIX")
	}

}
