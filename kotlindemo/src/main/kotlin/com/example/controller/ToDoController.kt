package com.example.controller



    import com.example.domain.ToDo
    import com.example.service.ToDoService
    import io.micronaut.http.annotation.Body
    import io.micronaut.http.annotation.Controller
    import io.micronaut.http.annotation.Get
    import io.micronaut.http.annotation.PathVariable
    import io.micronaut.http.annotation.Post
    import java.util.Optional

    @Controller("/todo")
    class ToDoController(private val toDoService : ToDoService) {

        @Get("/all")
        fun getAllToDos() : List<ToDo>{
            return toDoService.allToDos()
        }

        @Get("/{id}")
        fun getToDoById(@PathVariable id:Int) : Optional<ToDo>?{
            return toDoService.findToDoById(id)
        }

        @Post("/save")
        fun saveToDo(@Body toDo:ToDo) : ToDo{
            return toDoService.saveToDo(toDo)
        }

    }
