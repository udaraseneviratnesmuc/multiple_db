package beyondm.multidb.dao.dialog.impl;

import beyondm.multidb.dao.dialog.DialogDao;
import beyondm.multidb.dao.impl.UniversalDaoImpl;
import beyondm.multidb.model.dialog.DialogAccount;
import org.springframework.stereotype.Repository;

@Repository("dialogDao")
public class DialogDaoImpl extends UniversalDaoImpl<DialogAccount> implements DialogDao{
}
