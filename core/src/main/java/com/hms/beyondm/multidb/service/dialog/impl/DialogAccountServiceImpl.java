package com.hms.beyondm.multidb.service.dialog.impl;

import com.hms.beyondm.multidb.dao.dialog.DialogDao;
import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(value="transactionManager1")
@Service("dialogAccountService")
public class DialogAccountServiceImpl {
    @Autowired
    DialogDao dialogDao;

    public Long saveAccount(DialogAccount dialogAccount){
        return dialogDao.save(dialogAccount);
    }

}
