package com.scs.jdbc.dao.impl;

import com.scs.jdbc.dao.AreaDao;
import com.scs.jdbc.entity.Area;
import com.scs.jdbc.util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 10:55
 * @Description:
 */
public class AreaDaoImpl implements AreaDao {

    private Connection connection = Dbutil.getConnection();
    @Override
    public  List<Area> getAllArea() throws SQLException{
        String sql =" SELECT * FROM t_area ";
        List<Area> areaList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Area area = new Area();
                area.setProvinceName(resultSet.getString("provinceName"));
                area.setProvinceEnglishName(resultSet.getString("provinceEnglishName"));
                area.setProvinceZipCode(resultSet.getString("province_zipCode"));
                area.setCityName(resultSet.getString("cityName"));
                area.setCityEnglishName(resultSet.getString("cityEnglishName"));
                area.setCityZipCode(resultSet.getString("city_zipCode"));
                area.setProvinceConfirmedCount(resultSet.getInt("province_confirmedCount"));
                area.setProvinceSuspectedCount(resultSet.getInt("province_suspectedCount"));
                area.setProvinceCuredCount(resultSet.getInt("province_curedCount"));
                area.setProvinceDeadCount(resultSet.getInt("province_deadCount"));
                area.setCityConfirmedCount(resultSet.getInt("city_confirmedCount"));
                area.setCitySuspectedCount(resultSet.getInt("city_suspectedCount"));
                area.setCityCuredCount(resultSet.getInt("city_curedCount"));
                area.setCityDeadCount(resultSet.getInt("city_deadCount"));
                area.setUpdateTime(resultSet.getTimestamp("updateTime"));
                areaList.add(area);
            }

        return areaList;
    }
}
