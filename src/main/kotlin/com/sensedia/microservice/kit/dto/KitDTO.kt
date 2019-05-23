package com.sensedia.microservice.kit.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.sensedia.microservice.kit.enum.Gender
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class KitDTO(
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    val id: Long? = null,

    @field: NotBlank
    val phone: String,

    @field: NotNull
    val gender: Gender,

    @field: NotNull
    var specifications: List<SpecificationDTO>
)