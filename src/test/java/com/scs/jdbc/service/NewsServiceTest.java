package com.scs.jdbc.service;

import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.util.Result;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsServiceTest {
    private NewsService newsService = ServiceFactory.getNewsServiceInstance();

    @Test
    public void getAllNewsVo() {
        Result result = newsService.getAllNewsVo();
        assert  result!=null;
    }
}