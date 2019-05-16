package com.sensedia.microservice.kit.service.impl

import com.sensedia.microservice.kit.model.Kit
import com.sensedia.microservice.kit.repository.KitRepository
import com.sensedia.microservice.kit.service.KitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KitServiceImpl : KitService {

    @Autowired
    lateinit var kitRepository: KitRepository

    override fun create(kit: Kit): Kit {
        return kitRepository.save(kit)
    }
}