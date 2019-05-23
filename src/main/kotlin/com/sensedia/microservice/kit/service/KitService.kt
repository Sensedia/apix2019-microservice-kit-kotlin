package com.sensedia.microservice.kit.service

import com.sensedia.microservice.kit.model.Kit
import java.util.Optional

interface KitService {
    fun create(kit: Kit): Kit

    fun find(id: Long): Kit
}