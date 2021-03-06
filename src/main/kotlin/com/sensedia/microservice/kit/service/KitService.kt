package com.sensedia.microservice.kit.service

import com.sensedia.microservice.kit.model.Kit

interface KitService {
    fun create(kit: Kit): Kit

    fun find(id: Long): Kit

    fun deleteById(id: Long)
}