package com.hms.beyondm.multidb.service.dialog;

import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;

public interface DialogAccountService {
    public Long saveAccount(DialogAccount account);

    public DialogAccount findAccountById(Long accountId);
}
