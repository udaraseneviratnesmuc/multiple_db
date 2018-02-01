package beyondm.multidb.dao;

public interface UniversalDao<T> {
    Long save(T object);

    void update(T object);

    void merge(T object);

    void delete(T object);
}
