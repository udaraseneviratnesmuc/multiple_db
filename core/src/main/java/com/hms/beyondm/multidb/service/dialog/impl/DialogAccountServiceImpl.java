package com.hms.beyondm.multidb.service.dialog.impl;

import com.hms.beyondm.multidb.dao.dialog.DialogDao;
import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import com.hms.beyondm.multidb.service.dialog.DialogAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("dialogAccountService")
public class DialogAccountServiceImpl implements DialogAccountService{

    @Autowired
    DialogDao dialogDao;

    @Transactional("transactionManager2")
    public Long saveAccount(DialogAccount account) {
        return dialogDao.save(account);
    }
}
