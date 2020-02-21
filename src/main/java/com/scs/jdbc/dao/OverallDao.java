package com.scs.jdbc.dao;

import com.scs.jdbc.entity.Overall;

import java.sql.SQLException;
import java.util.List;

public interface OverallDao {
    List<Overall> getAllOverall() throws SQLException;
}
