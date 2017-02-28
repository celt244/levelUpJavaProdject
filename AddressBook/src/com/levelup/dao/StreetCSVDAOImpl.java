package com.levelup.dao;

import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.entity.Street;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by Arthur on 28.02.2017.
 */
public class StreetCSVDAOImpl extends AbstractCSVDAO<Street> {

    public StreetCSVDAOImpl(final FileDataProviderImpl fileDataProvider, String fileName) {
        super(fileDataProvider, fileName, "id;streetName");
    }



    @Override
    protected Street parseEntity(String str) {
        String[] params = str.split(";");

        long id = Long.parseLong(params[0]);
        String streetName = params[1];

        return new Street(id, streetName);
    }

    @Override
    public String viewEntity(Street entity) {
        return entity.getId() + ";" + entity.getStreetName() + "\r\n";
    }

    @Override
    public void update(Street street) {

    }

    @Override
    public void delete(Street street) {

    }
}
