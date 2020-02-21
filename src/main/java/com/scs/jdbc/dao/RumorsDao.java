package com.scs.jdbc.dao;

import com.scs.jdbc.entity.Rumors;

import java.sql.SQLException;
import java.util.List;

public interface RumorsDao {
    List<Rumors> getAllRumors() throws SQLException;
}
