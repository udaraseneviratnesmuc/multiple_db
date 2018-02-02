package com.hms.beyondm.multidb.dao.mobitel.impl;

import com.hms.beyondm.multidb.dao.impl.UniversalDaoDialogImpl;
import com.hms.beyondm.multidb.dao.impl.UniversalDaoMobitelImpl;
import com.hms.beyondm.multidb.dao.mobitel.MobitelDao;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import org.springframework.stereotype.Repository;

@Repository("mobitelDao")
public class MobitelDaoImpl extends UniversalDaoMobitelImpl<MobitelAccount> implements MobitelDao {
}
