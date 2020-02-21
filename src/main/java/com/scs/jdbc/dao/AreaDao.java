package com.scs.jdbc.dao;

import com.scs.jdbc.entity.Area;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 10:53
 * @Description:
 */
public interface AreaDao {
    List<Area> getAllArea() throws SQLException;
}
