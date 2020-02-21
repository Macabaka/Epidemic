package com.scs.jdbc.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MysqlUtilTest {
    private MysqlUtil mysqlUtil = new MysqlUtil();
    @Test
    public void getArea() {
        mysqlUtil.getArea();
    }

    @Test
    public void getNews() {
        mysqlUtil.getNews();
    }

    @Test
    public void getOverall() {
        mysqlUtil.getOverall();
    }

    @Test
    public void getRumors() {
        mysqlUtil.getRumors();
    }
}