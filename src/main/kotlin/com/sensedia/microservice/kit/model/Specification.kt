package com.sensedia.microservice.kit.model

import com.sensedia.microservice.kit.enum.Color
import com.sensedia.microservice.kit.enum.Type
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Specification(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Enumerated(EnumType.STRING)
    @Column(name="type")
    val type: Type,

    @Enumerated(EnumType.STRING)
    @Column(name="color")
    val color: Color,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kit_id", referencedColumnName = "id")
    val kit: Kit? = null

)