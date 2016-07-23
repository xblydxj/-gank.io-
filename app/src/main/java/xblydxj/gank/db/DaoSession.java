package xblydxj.gank.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import xblydxj.gank.db.dataCatch;

import xblydxj.gank.db.dataCatchDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dataCatchDaoConfig;

    private final dataCatchDao dataCatchDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dataCatchDaoConfig = daoConfigMap.get(dataCatchDao.class).clone();
        dataCatchDaoConfig.initIdentityScope(type);

        dataCatchDao = new dataCatchDao(dataCatchDaoConfig, this);

        registerDao(dataCatch.class, dataCatchDao);
    }
    
    public void clear() {
        dataCatchDaoConfig.getIdentityScope().clear();
    }

    public dataCatchDao getDataCatchDao() {
        return dataCatchDao;
    }

}