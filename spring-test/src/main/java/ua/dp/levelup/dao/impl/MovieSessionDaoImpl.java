package ua.dp.levelup.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import ua.dp.levelup.dao.MovieSessionDao;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Repository
public class MovieSessionDaoImpl implements MovieSessionDao{

    @Autowired
    private HibernateTemplate template;


    @Value(value = "${my.value:default-value}")
    private String value;
}
