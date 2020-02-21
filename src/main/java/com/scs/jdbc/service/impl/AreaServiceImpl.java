package com.scs.jdbc.service.impl;

import com.scs.jdbc.dao.AreaDao;
import com.scs.jdbc.entity.Area;
import com.scs.jdbc.factory.DaoFactory;
import com.scs.jdbc.service.AreaService;
import com.scs.jdbc.util.Result;
import com.scs.jdbc.util.ResultCode;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 11:18
 * @Description:
 */
public class AreaServiceImpl implements AreaService {
    private AreaDao areaDao = DaoFactory.getAreaDaoInstance();
    @Override
    public Result getAllArea() {
        List<Area> areaList = null;
        try {
            areaList = areaDao.getAllArea();
        } catch (SQLException e) {
            System.out.println("获取area表出错");
        }
        if(areaList!=null){
            return Result.success(areaList);
        }else{
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
    }
}
