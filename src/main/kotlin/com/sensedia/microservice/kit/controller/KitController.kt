package com.sensedia.microservice.kit.controller

import com.sensedia.microservice.kit.dto.KitDTO
import com.sensedia.microservice.kit.mapper.KitMapper
import com.sensedia.microservice.kit.service.KitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("kit")
class KitController {

    @Autowired
    lateinit var kitService: KitService;

    @PostMapping
    fun create(@Valid @RequestBody kitDto: KitDTO): ResponseEntity<KitDTO> {
        val kit = KitMapper.toModel(kitDto)
        kitService.create(kit)

        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun find(@PathVariable id: Long): ResponseEntity<KitDTO> {
        val kit = kitService.find(id)

        return ResponseEntity(KitMapper.toDto(kit), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<KitDTO> {
        kitService.deleteById(id)

        return ResponseEntity(HttpStatus.OK)
    }
}