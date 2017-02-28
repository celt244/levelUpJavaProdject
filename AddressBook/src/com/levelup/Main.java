package com.levelup;

import com.levelup.dao.DAO;
import com.levelup.dao.StreetCSVDAOImpl;
import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.entity.Street;

import java.util.ArrayList;

/**
 * Created by java on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        FileDataProviderImpl provider = new FileDataProviderImpl("");

        DAO<Street> streetDAO = new StreetCSVDAOImpl(provider, "street.csv");

        provider.openConnection();

        ArrayList<Street> streets = streetDAO.read();

        System.out.println(streets);

        streetDAO.create(new Street(6L, "Mazepy"));
    }
}
