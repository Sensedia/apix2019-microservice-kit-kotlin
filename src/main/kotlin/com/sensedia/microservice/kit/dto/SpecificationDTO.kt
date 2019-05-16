package com.sensedia.microservice.kit.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.sensedia.microservice.kit.enum.Color
import com.sensedia.microservice.kit.enum.Type
import javax.validation.constraints.NotBlank

data class SpecificationDTO(

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    val id: Long? = null,

    @field: NotBlank
    val type: Type,

    @field: NotBlank
    val color: Color
)