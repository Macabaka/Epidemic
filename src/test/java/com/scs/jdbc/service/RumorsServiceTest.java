package com.scs.jdbc.service;

import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.util.Result;
import org.junit.Test;

import static org.junit.Assert.*;

public class RumorsServiceTest {
    private  RumorsService rumorsService = ServiceFactory.getRumorsServiceInstance();

    @Test
    public void getAllRumors() {
        Result result = rumorsService.getAllRumors();
        assert  result!=null;
    }
}