package dao;

import java.util.List;

public interface IDAO <T>  {
    T guardar(T var1);

    List<T> listarTodos();
}

