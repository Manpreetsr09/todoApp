package man.run2.mytodoapp

import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<Todo>()

    fun getAllTodo() : List<Todo>{
return todoList
    }

    fun addTodo(title :String){
todoList.add(Todo(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deletTodo(id : Int){
todoList.removeIf{
    it.id == id
    }
}
}