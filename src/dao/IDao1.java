package dao;

import java.util.List;

public interface IDao1<T>{
    //crear
    T guardar (T t);

    //consultar todos los T
    List<T> listarTodos();


}
