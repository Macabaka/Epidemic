package com.scs.jdbc.service;

import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.util.Result;
import org.junit.Test;

import static org.junit.Assert.*;

public class OverallServiceTest {
    private  OverallService overallService = ServiceFactory.getOverallServiceInstance();

    @Test
    public void getAllOverall() {
        Result result = overallService.getAllOverall();
        assert  result!=null;
    }
}