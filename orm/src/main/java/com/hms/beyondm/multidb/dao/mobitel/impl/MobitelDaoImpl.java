package com.hms.beyondm.multidb.dao.mobitel.impl;

import com.hms.beyondm.multidb.dao.mobitel.MobitelDao;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import org.springframework.stereotype.Repository;

@Repository("mobitelDao")
public class MobitelDaoImpl extends UniversalDaoImpl<MobitelAccount> implements MobitelDao {
}
