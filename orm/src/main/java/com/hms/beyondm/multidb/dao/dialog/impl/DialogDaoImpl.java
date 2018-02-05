package com.hms.beyondm.multidb.dao.dialog.impl;

import com.hms.beyondm.multidb.dao.UniversalDao;
import com.hms.beyondm.multidb.dao.dialog.DialogDao;
import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("dialogDao")
public class DialogDaoImpl extends UniversalDaoImpl<DialogAccount> implements DialogDao{
    public DialogAccount getAccountById(Long id) {
        Session session = getCurrentSession();
        return (DialogAccount) session.createCriteria(DialogAccount.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }
}
