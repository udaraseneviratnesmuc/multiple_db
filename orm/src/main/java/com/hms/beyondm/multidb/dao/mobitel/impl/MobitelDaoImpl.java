package com.hms.beyondm.multidb.dao.mobitel.impl;

import com.hms.beyondm.multidb.dao.mobitel.MobitelDao;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("mobitelDao")
public class MobitelDaoImpl extends UniversalDaoImpl<MobitelAccount> implements MobitelDao {
    public MobitelAccount getAccountById(Long id) {
        Session session = getCurrentSession();
        return (MobitelAccount) session.createCriteria(MobitelAccount.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }
}
