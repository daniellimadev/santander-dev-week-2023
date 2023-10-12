package com.study.daniel.santanderdevweek2023.service;

import java.util.List;

public interface CrudService <ID, T>{
    List<T> findAll();
    T findById(ID id);
    T create(T entity);
    void  delete(ID id);
}
