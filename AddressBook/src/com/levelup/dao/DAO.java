package com.levelup.dao;

import java.util.ArrayList;

/**
 * Created by Arthur on 28.02.2017.
 */
public interface DAO<T> {

    void create (T t);

    ArrayList<T> read();

    void update(T t);

    void delete(T t);

}
