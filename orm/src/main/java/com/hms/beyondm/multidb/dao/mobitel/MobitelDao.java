package com.hms.beyondm.multidb.dao.mobitel;

import com.hms.beyondm.multidb.dao.UniversalDao;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;

public interface MobitelDao extends UniversalDao<MobitelAccount>{
    MobitelAccount getAccountById(Long id);
}
