package com.scs.jdbc.dao;

import com.scs.jdbc.dao.impl.FileDaoImpl;
import com.scs.jdbc.factory.DaoFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileDaoTest {
    private FileDao fileDao = DaoFactory.getFileDaoInstance();

    @Test
    public void insertAreaMessage() {
        fileDao.insertAreaMessage();
    }

    @Test
    public void insertNewsMessage() {
        fileDao.insertNewsMessage();
    }

    @Test
    public void insertOverallMessage() {
        fileDao.insertOverallMessage();
    }

    @Test
    public void insertRumorsMessage() {
        fileDao.insertRumorsMessage();
    }
}