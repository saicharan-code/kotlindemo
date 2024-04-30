package com.example.repository


import com.example.domain.ToDo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface ToDoRepository : CrudRepository<ToDo, Int> {
}