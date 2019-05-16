package com.sensedia.microservice.kit.mapper

import com.sensedia.microservice.kit.dto.KitDTO
import com.sensedia.microservice.kit.model.Kit
import com.sensedia.microservice.kit.model.Specification

class KitMapper {
    companion object {
        fun toModel(dto: KitDTO): Kit {

            val kit = Kit(
                phone = dto.phone,
                gender = dto.gender
            )

            val specifications = dto.specifications
                .map { Specification(id = it.id, type = it.type, color = it.color, kit = kit) }
                .toList()

            kit.specifications = specifications

            return kit
        }
    }
}
