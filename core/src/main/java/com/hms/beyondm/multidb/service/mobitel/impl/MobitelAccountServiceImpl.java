package com.hms.beyondm.multidb.service.mobitel.impl;

import com.hms.beyondm.multidb.dao.mobitel.MobitelDao;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import com.hms.beyondm.multidb.service.mobitel.MobitelAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("mobitelAccountService")
public class MobitelAccountServiceImpl implements MobitelAccountService{

    @Autowired
    MobitelDao mobitelDao;

    @Transactional("transactionManager1")
    public Long saveAccount(MobitelAccount account) {

        return mobitelDao.save(account);
    }
}

