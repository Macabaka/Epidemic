package com.scs.jdbc.service;

import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.util.Result;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaServiceTest {
    private AreaService areaService = ServiceFactory.getAreaServiceInstance();
    @Test
    public void getAllArea() {
        Result result = areaService.getAllArea();
        assert  result!=null;
    }
}