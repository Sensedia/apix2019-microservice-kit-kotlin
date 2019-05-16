package com.sensedia.microservice.kit.repository

import com.sensedia.microservice.kit.model.Kit
import org.springframework.data.jpa.repository.JpaRepository

interface KitRepository: JpaRepository<Kit, Long>