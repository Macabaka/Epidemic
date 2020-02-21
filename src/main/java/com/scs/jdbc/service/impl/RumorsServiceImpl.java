package com.scs.jdbc.service.impl;

import com.scs.jdbc.dao.RumorsDao;
import com.scs.jdbc.entity.Rumors;
import com.scs.jdbc.factory.DaoFactory;
import com.scs.jdbc.service.RumorsService;
import com.scs.jdbc.util.Result;
import com.scs.jdbc.util.ResultCode;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 15:53
 * @Description:
 */
public class RumorsServiceImpl implements RumorsService {

    private RumorsDao rumorsDao = DaoFactory.getRumorsDaoInstance();

    @Override
    public Result getAllRumors() {
        List<Rumors>   rumorsList=null;
        try {
           rumorsList = rumorsDao.getAllRumors();
        } catch (SQLException e) {
            System.out.println("获取rumors表出错");
        }if(rumorsList != null){
            return Result.success(rumorsList);
        }else{
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }

    }
}
