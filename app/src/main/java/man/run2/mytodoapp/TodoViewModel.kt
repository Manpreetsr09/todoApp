package man.run2.mytodoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class TodoViewModel : ViewModel() {

    private var _todoList = MutableLiveData<List<Todo>>()
    var todoList : LiveData<List<Todo>> = _todoList

    fun getAllTodo() {
_todoList.value = TodoManager.getAllTodo().reversed()
    }

    fun addTodo(title : String){
TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deletTodo(id :Int){
        TodoManager.deletTodo(id)
getAllTodo()
    }
}