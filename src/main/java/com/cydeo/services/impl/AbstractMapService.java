package com.cydeo.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, ID> {


    protected Map<ID, T> map = new HashMap<>();

    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    List<T> findAll() {
        return new ArrayList<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);

    }

    void deleteByID(ID id) {
        map.remove(id);

    }

}
//
//    T save(T object);
//    List<T> findAll();
//    T findById(ID id);
//    void delete (T object);
//    void deleteById(ID id);
//}

