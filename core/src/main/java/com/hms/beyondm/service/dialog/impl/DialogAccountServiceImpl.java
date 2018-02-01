package com.hms.beyondm.service.dialog.impl;

import beyondm.multidb.dao.dialog.DialogDao;
import beyondm.multidb.model.dialog.DialogAccount;
import com.hms.beyondm.service.dialog.DialogAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("dialogAccountService")
public class DialogAccountServiceImpl implements DialogAccountService{

    @Autowired
//    DialogDao dialogDao;

    public Long saveAccount(DialogAccount account) {
//        return dialogDao.save(account);
        return null;
    }
}
