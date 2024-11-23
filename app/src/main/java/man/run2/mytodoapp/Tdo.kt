package man.run2.mytodoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id :Int,
    var title : String,
    var createdAt : Date
)

fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo(1,"first todo",Date.from(Instant.now())),
        Todo(2,"Secondddd todo",Date.from(Instant.now())),
        Todo(3,"this is my thirddd todo",Date.from(Instant.now())),
        Todo(4," this is my forthhh todo", Date.from(Instant.now())),
    );
}