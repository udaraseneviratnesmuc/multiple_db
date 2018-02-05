package com.hms.beyondm.multidb.dao.dialog.impl;

import com.hms.beyondm.multidb.dao.UniversalDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

public class UniversalDaoImpl<T extends Serializable> implements UniversalDao<T>{

    @Autowired
    @Qualifier("sessionFactory2")
    protected SessionFactory sessionFactory;

    public Long save(T object) {
        Session session = getCurrentSession();
        return (Long)session.save(object);
    }

    public void update(T object) {
        Session session = getCurrentSession();
        session.update(object);
    }

    public void merge(T object) {
        Session session = getCurrentSession();
        session.merge(object);
    }

    public void delete(T object) {
        Session session = getCurrentSession();
        session.delete(object);
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
