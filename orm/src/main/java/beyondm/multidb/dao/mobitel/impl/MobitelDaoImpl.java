package beyondm.multidb.dao.mobitel.impl;

import beyondm.multidb.dao.UniversalDao;
import beyondm.multidb.dao.impl.UniversalDaoImpl;
import beyondm.multidb.dao.mobitel.MobitelDao;
import beyondm.multidb.model.mobitel.MobitelAccount;
import org.springframework.stereotype.Repository;

@Repository("mobitelDao")
public class MobitelDaoImpl extends UniversalDaoImpl<MobitelAccount> implements MobitelDao{
}
