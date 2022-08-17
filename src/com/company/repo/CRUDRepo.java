package com.company.repo;

import java.util.ArrayList;

public interface CRUDRepo<T> {
    void create(T t);
    ArrayList<T> findAll();
    T findById(long id);
    void update(T t, long id);
    void delete(long id);
}
