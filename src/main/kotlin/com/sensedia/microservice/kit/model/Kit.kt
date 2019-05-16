package com.sensedia.microservice.kit.model

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Kit(

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "phone")
    val phone: String,

    @Column(name = "gender")
    val gender: String,

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "kit")
    var specifications: List<Specification>? = null
)