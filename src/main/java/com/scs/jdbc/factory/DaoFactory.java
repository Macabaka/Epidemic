package com.scs.jdbc.factory;

import com.scs.jdbc.dao.*;
import com.scs.jdbc.dao.impl.*;


/**
 * @author Jack
 * @Date: 2020/2/18 16:11
 * @Description:
 */
public class DaoFactory {

    public static AreaDao getAreaDaoInstance() {
        return new AreaDaoImpl();
    }

    public static NewsDao getNewsDaoInstance() {
        return new NewsDaoImpl();
    }

    public static OverallDao getOverallDaoInstance(){
        return new OverallDaoImpl();
    }

    public static RumorsDao getRumorsDaoInstance(){
        return new RumorsDaoImpl();
    }

    public static FileDao getFileDaoInstance(){
        return new FileDaoImpl();
    }
}
