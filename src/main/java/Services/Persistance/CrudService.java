package Services.Persistance;

import java.util.List;

public interface CrudService<T> {
    void create(T t);
    List<T> findAll();
    T findById(String id);
    void update(T t);
    void delete(T t);
}
