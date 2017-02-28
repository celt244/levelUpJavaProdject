package com.levelup.dao;

import com.levelup.dao.impl.FileDataProviderImpl;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Arthur on 28.02.2017.
 */
public abstract class AbstractFileDAO<T> implements DAO<T> {

    private Long id;
    protected final FileDataProviderImpl fileDataProvider;
    private String fileName;

    public AbstractFileDAO(FileDataProviderImpl fileDataProvider, String fileName) {
        this.fileDataProvider = fileDataProvider;
        this.fileName = fileName;
        fileDataProvider.appendFile(fileName);
    }

    public RandomAccessFile getDataFile() throws FileNotFoundException {
        return fileDataProvider.getDataFile(fileName);
    }

    public String getFileName() { return fileName; }

//    @Override
//    public void create(T t) {
//
//    }
//
//    @Override
//    public ArrayList<T> read() {
//        return null;
//    }
//
//    @Override
//    public void update(T t) {
//
//    }
//
//    @Override
//    public void delete(T t) {
//
//    }
}