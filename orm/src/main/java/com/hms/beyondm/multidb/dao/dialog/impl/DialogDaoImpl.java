package com.hms.beyondm.multidb.dao.dialog.impl;

import com.hms.beyondm.multidb.dao.dialog.DialogDao;
import com.hms.beyondm.multidb.dao.impl.UniversalDaoDialogImpl;
import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import org.springframework.stereotype.Repository;

@Repository("dialogDao")
public class DialogDaoImpl extends UniversalDaoDialogImpl<DialogAccount> implements DialogDao{
}
