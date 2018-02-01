package com.hms.beyondm.service.mobitel.impl;

import beyondm.multidb.dao.mobitel.MobitelDao;
import beyondm.multidb.model.mobitel.MobitelAccount;
import com.hms.beyondm.service.mobitel.MobitelAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("mobitelAccountService")
public class MobitelAccountServiceImpl implements MobitelAccountService{

    @Autowired
    MobitelDao mobitelDao;

    public Long saveAccount(MobitelAccount account) {
        return mobitelDao.save(account);

//        return null;
    }
}
