package com.hms.beyondm.multidb.service.mobitel;

import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;

public interface MobitelAccountService {
    public Long saveAccount(MobitelAccount account);

    public MobitelAccount findAccountById(Long accountId);
}
