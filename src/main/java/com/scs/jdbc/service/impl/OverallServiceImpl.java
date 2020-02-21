package com.scs.jdbc.service.impl;

import com.scs.jdbc.dao.OverallDao;
import com.scs.jdbc.entity.Overall;
import com.scs.jdbc.factory.DaoFactory;
import com.scs.jdbc.service.OverallService;
import com.scs.jdbc.util.Result;
import com.scs.jdbc.util.ResultCode;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 15:53
 * @Description:
 */
public class OverallServiceImpl implements OverallService {
    private OverallDao overallDao = DaoFactory.getOverallDaoInstance();
    @Override
    public Result getAllOverall() {
        List<Overall> overallList = null ;
        try {
            overallList = overallDao.getAllOverall();
        } catch (SQLException e) {
            System.out.println("获取overall表出错");
        }
        if(overallList != null){
            return Result.success(overallList);
        }else{
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
    }
}
