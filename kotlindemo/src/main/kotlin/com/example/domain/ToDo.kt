package com.example.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


//import io.micronaut.data.annotation.GeneratedValue
//import io.micronaut.data.annotation.Id
//import io.micronaut.data.annotation.MappedEntity

@Entity
@Table(name = "todo")
data class ToDo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int? = null,
    val title:String,
    val completed:Boolean = false
)