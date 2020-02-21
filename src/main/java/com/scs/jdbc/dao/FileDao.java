package com.scs.jdbc.dao;

import java.sql.SQLException;

public interface FileDao {
    /**
     * 插入数据至area表
     */
    void insertAreaMessage();

    /**
     * 插入数据至news
     */
    void insertNewsMessage();

    /**
     * 插入数据至overall表
     */
    void insertOverallMessage();

    /**
     * 插入数据至rumors表
     */
    void insertRumorsMessage();
}
